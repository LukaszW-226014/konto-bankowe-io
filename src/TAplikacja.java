import java.text.SimpleDateFormat;
import java.util.*;


public class TAplikacja {

	public List<TKlient> listaKlient = new ArrayList<>();
	private List<TPracownik> listaPracownik = new ArrayList<>();

	enum Komunikaty { _error, _success, _brakLokat, _errorID, _brakKasy, _niePuste, _niePoprawnyWniosek, _brakZdolnosci, _udzielonoKredytu}

	enum MenuContent { _entryMenu, _klientMenu, _pracownikMenu}
	MenuContent currentContent = MenuContent._entryMenu;

	public void displayMenu() {

		switch (currentContent){
			case _entryMenu: System.out.println("***********************************************************************\n"
					+ "Wybierz funkcjonalnosci: \n" + "1. Klient\n" + "2. Pracownik\n" + "0. Wyjdz\n");
				break;
			case _klientMenu: System.out.println("***********************************************************************\n"
					+ "Klient: " + listaKlient.get(0).getImie() + " " + listaKlient.get(0).getNazwisko() + "\n"
					+ "Twoje saldo = " + listaKlient.get(0).listaKont.get(0).getSaldo() +"\n" + "1. Zaloz lokate\n" + "2. Zerwij lokate\n"
					+ "3. Przelej srodki\n" + "4. Zloz wniosek kredytowy\n" + "5. Pobierz Wyciag\n" + "6. Zamknij konto\n" + "0. Wyjdz\n");
				break;
			case _pracownikMenu: System.out.println("***********************************************************************\n"
					+ "Pracownik: " + listaPracownik.get(0).getImie() + " " + listaPracownik.get(0).getNazwisko() + "\n"
					+ "Oczekujace wnioski = " + listaPracownik.get(0).listaWnioskow.size() + "\n" + "1. Zaloz Konto\n" + "2. Weryfikacja Wniosku Kredytowego\n" + "0. Wyjdz\n");
				break;
			default:
				break;
		}
	}

	public void operationMenu(){
		int param = 0;
		do {
			currentContent = MenuContent._entryMenu;
			displayMenu();
			Scanner choice = new Scanner(System.in);
			switch (param = choice.nextInt()){
				case 1:
					currentContent = MenuContent._klientMenu;
					displayMenu();
					int paramK = 0;
					do {
						switch (paramK = choice.nextInt()){
							case 1:
								//zalozenieLokaty();
								break;
							case 2: zerwijLokate();
								break;
							case 3:
								System.out.println("Podaj nr rachunku: ");
								Scanner odczyt = new Scanner(System.in);
								int nr = odczyt.nextInt();
								System.out.println("Wprowadz kwote: ");
								long kwota = odczyt.nextLong();
								//przelejSrodki(nr, kwota);
								break;
							case 4: zlozenieWnioskuKredytowego();
								break;
							case 5:
								//pobierzWyciag();
								break;
							case 6:
								//zamknijKonto();
								break;
							default:
								break;
						}
					}while (paramK != 0);
					break;
				case 2:
					currentContent = MenuContent._pracownikMenu;
					displayMenu();
					int paramP = 0;
					do {
						switch (paramP = choice.nextInt()){
							case 1:
								//zalozKonto();
								break;
							case 2: weryfikacjaWnioskuKredytowego();
								break;
							default:
								break;
						}
					}while (paramP !=0);
					break;
				default:
					break;
			}
		}while (param != 0);
	}

	/**
	 *
	 * @param k
	 */
	public void wyslijKomunikat(Komunikaty k) {
		switch (k){
			case _error:
				System.out.println("Error\n");
				break;
			case _success:
				System.out.println("Zadanie zakonczone powodzeniem!\n");
				break;
			case _brakLokat:
				System.out.println("Brak lokat");
				break;
			case _errorID:
				System.out.println("Nieprawidlowy index");
				break;
			case _brakKasy:
				System.out.println("Brak wystarczajacej ilosci srodkow na koncie");
				break;
			case _niePuste:
				System.out.println("Na koncie sa srodki!!!");
				break;
			case _niePoprawnyWniosek:
				System.out.println("Niepoprawny wniosek!");
				break;
			case _brakZdolnosci:
				System.out.println("Brak zdolnosci kredytowej");
				break;
			case _udzielonoKredytu:
				System.out.println("Udzielono kredytu. Gratulacje!");
		}
	}

	/**
	 *
	 * @param kwota
	 */
	public boolean przelejSrodki(float kwota, TKonto konto1, TKonto konto2) {
//		if (sprawdzSaldoWystarczajace(kwota)){
//			listaKlient.get(0).listaKont.get(0).setSaldo(listaKlient.get(0).listaKont.get(0).getSaldo() - kwota);
//			// TODO dodac dodawanie srodkow na zadany rachunek
//			Calendar calendar = Calendar.getInstance();
//			Date data = calendar.getTime();
//			listaKlient.get(0).listaKont.get(0).listaTransakcja.add(new TTransakcja(listaKlient.get(0).listaKont.get(0).listaTransakcja.size() + 1, data, "Przelew", new Date()));
//			wyslijKomunikat(Komunikaty._success);
//		}
//		else
//			wyslijKomunikat(Komunikaty._brakKasy);
		if (sprawdzSaldo(kwota, konto1)){
			konto1.setSaldo(konto1.getSaldo() - kwota);
			konto2.setSaldo(konto2.getSaldo() + kwota);
			return true;
		}
		else {
			return false;
		}

	}

	public boolean zalozenieLokaty(float kwota, TKonto konto, int okres) {
//		TLokata lokata = new TLokata();
//		System.out.println("Podaj kwote: ");
//		Scanner odczytKwota = new Scanner(System.in);
//		long kwota = odczytKwota.nextLong();
//		if (sprawdzSaldoWystarczajace(kwota)){
//			lokata.setKwota(kwota);
//			System.out.println("Podaj okres: ");
//			Scanner odczytOkres = new Scanner(System.in);
//			int okres = odczytOkres.nextInt();
//
//			Calendar calendar = Calendar.getInstance();
////		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
////		System.out.println(calendar.getTime());
//			Date dataZakonczenia = new Date();
//			dataZakonczenia = calendar.getTime();
//			dataZakonczenia.setMonth(dataZakonczenia.getMonth() + okres);
////		System.out.println(dataZakonczenia);
//			lokata.setDataZakonczenia(dataZakonczenia);
//
//			int liczIdex = listaKlient.get(0).listaLokat.size();
//			listaKlient.get(0).listaLokat.add(new TLokata(liczIdex, dataZakonczenia, kwota, 3));
//			przelejSrodki(00000000, kwota);
//			wyslijKomunikat(Komunikaty._success);
//		}
//		else{
//			wyslijKomunikat(Komunikaty._error);
//		}
		TLokata lokata = new TLokata();
		if (sprawdzSaldo(kwota, konto)){
			lokata.setKwota(kwota);
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			//System.out.println(calendar.getTime());
			Date dataZakonczenia = new Date();
			dataZakonczenia = calendar.getTime();
			dataZakonczenia.setMonth(dataZakonczenia.getMonth() + okres);
			//System.out.println(dataZakonczenia);
			lokata.setDataZakonczenia(dataZakonczenia);
			przelejSrodki(kwota, konto, new TKonto(1000000));
			return true;
		}
		else {
			return false;
		}
	}

	public boolean sprawdzSaldo(float kwota, TKonto konto) {
//		if (listaKlient.get(0).listaKont.get(0).getSaldo() > kwota){
//			return true;
//		}
//		else
//			return false;
		if (konto.getSaldo() >= kwota && kwota >= 0){
			return true;
		}
		else return false;
	}

	public void zerwijLokate() {
//			if (listaKlient.get(0).listaLokat.size() < 1){
//				wyslijKomunikat(Komunikaty._brakLokat);
//			}
//			else {
//				System.out.println("Twoje lokaty: ");
//				for (TLokata lokata : listaKlient.get(0).listaLokat) {
//					System.out.println(lokata.toString());
//				}
//				System.out.println("Podaj index lokaty do usuniecia: ");
//				Scanner odczyt = new Scanner(System.in);
//				int id = odczyt.nextInt();
//				try {
//					listaKlient.get(0).listaKont.get(0).setSaldo(listaKlient.get(0).listaKont.get(0).getSaldo() + listaKlient.get(0).listaLokat.get(id).getKwota());
//					listaKlient.get(0).listaLokat.remove(id);
//					wyslijKomunikat(Komunikaty._success);
//				} catch (IndexOutOfBoundsException e) {
//					wyslijKomunikat(Komunikaty._errorID);
//				}
//			}
	}

	public boolean czyLokatyZakonczone(TLokata lokata, 	Date time) {
		if (time.after(lokata.getDataZakonczenia())){
			return true;
		}
		else {
			return false;
		}
	}

	public void zalozKonto(TKlient klient, TKonto konto) {
//		try {
//			listaKlient.get(0).listaKont.add(new TKonto(listaKlient.get(0).listaKont.size() + 100, 0));
//			wyslijKomunikat(Komunikaty._success);
//		}catch (Exception e){
//			wyslijKomunikat(Komunikaty._error);
//		}
		klient.listaKont.add(konto);
	}

	public void zamknijKonto(TKlient klient, TKonto konto) {
//		System.out.println("Twoje konta: ");
//		for (TKonto konto : listaKlient.get(0).listaKont) {
//			System.out.println(konto.toString());
//		}
//		System.out.println("Podaj index konta do usuniecia: ");
//		Scanner odczyt = new Scanner(System.in);
//		int id = odczyt.nextInt();
//		try {
//			if (listaKlient.get(0).listaKont.get(id).getSaldo() < 1){
//				listaKlient.get(0).listaKont.remove(id);
//				wyslijKomunikat(Komunikaty._success);
//			}
//			else {
//				wyslijKomunikat(Komunikaty._niePuste);
//			}
//		} catch (IndexOutOfBoundsException e) {
//			wyslijKomunikat(Komunikaty._errorID);
//		}
		klient.listaKont.remove(konto);
		klient.listaKont.clear();
	}

	public void zlozenieWnioskuKredytowego() {
//		Scanner odczyt = new Scanner(System.in);
//		TWniosek wniosek = new TWniosek();
//		wniosek.setIdWniosek(listaPracownik.get(0).listaWnioskow.size()+1);
//		System.out.println("Podaj cel: ");
//		wniosek.setCel(odczyt.next());
//		System.out.println("Podaj kwote: ");
//		wniosek.setKwota(odczyt.nextLong());
//		System.out.println("Podaj okres: ");
//		wniosek.setOkres(odczyt.nextInt());
//		System.out.println("Podaj ubezpieczenie: ");
//		wniosek.setUbezpieczenie(odczyt.next());
//		System.out.println("Podaj dochody");
//		wniosek.setDochod(odczyt.nextFloat());
//		wniosek.setZlozonoZasDoch(true);
//		System.out.println("Podaj liczbe czlonkow rodziny: ");
//		wniosek.setLiczbaCzlonkowRodziny(odczyt.nextInt());
//		Calendar calendar = Calendar.getInstance();
//		Date data = calendar.getTime();
//		wniosek.setDataRopatrzenia(data);
//		listaPracownik.get(0).listaWnioskow.add(wniosek);
//		wyslijKomunikat(Komunikaty._success);
	}

	public void weryfikacjaWnioskuKredytowego() {
//		for (TWniosek wniosek:listaPracownik.get(0).listaWnioskow) {
//			System.out.println(wniosek.toString());
//		}
//		System.out.println("Podaj index wniosku: ");
//		Scanner odczyt = new Scanner(System.in);
//		int id = odczyt.nextInt();
//		try {
//			System.out.println("Czy wniosek poprawny?");
//			if (odczyt.next().equals("tak")){
//				listaPracownik.get(0).listaWnioskow.get(id).setCzyPoprawny(true);
//				System.out.println("Czy zdolnosc kredytowa?");
//				if (odczyt.next().equals("tak")){
//					listaPracownik.get(0).listaWnioskow.get(id).setCzyZdolnosc(true);
//					udzielKredytu(id);
//					wyslijKomunikat(Komunikaty._udzielonoKredytu);
//				}
//				else {
//					wyslijKomunikat(Komunikaty._brakZdolnosci);
//				}
//			}
//			else{
//				wyslijKomunikat(Komunikaty._niePoprawnyWniosek);
//			}
//		}catch (Exception e){
//			wyslijKomunikat(Komunikaty._error);
//		}
	}

	public boolean czyZalega(float saldo) {
		if (saldo < 0){
			return true;
		}
		else {
			return false;
		}
	}

	public void udzielKredytu(int id, float kwota, TKonto konto) {
//		listaKlient.get(0).listaKont.get(0).setSaldo(listaKlient.get(0).listaKont.get(0).getSaldo() + listaPracownik.get(0).listaWnioskow.get(id).getKwota());
//		Calendar calendar = Calendar.getInstance();
//		Date data = calendar.getTime();
//		Date dataZakonczenia = data;
//		dataZakonczenia.setMonth(dataZakonczenia.getMonth() + listaPracownik.get(0).listaWnioskow.get(id).getOkres());
//		listaKlient.get(0).listaKredytow.add(new TKredyt(listaPracownik.get(0).listaWnioskow.get(id).getKwota(), listaPracownik.get(0).listaWnioskow.get(id).getCel(), listaPracownik.get(0).listaWnioskow.get(id).getOkres(), listaPracownik.get(0).listaWnioskow.get(id).getUbezpieczenie(), dataZakonczenia, data));
		przelejSrodki(kwota, new TKonto(10000000), konto);
	}

	public List<TTransakcja> pobierzWyciag(List<TTransakcja> listaTransakcji) {
		List<TTransakcja> wyciag = new ArrayList<>();
		for (TTransakcja transakcja : listaTransakcji) {
			wyciag.add(transakcja);
		}
		return wyciag;
	}

	public TAplikacja(){
		listaPracownik.add(new TPracownik(1, "Pawel", "Kowalski"));
		listaKlient.add(new TKlient(1, "Jan", "Klocek", 981108023, "ul. Kobry 11", "99500", "Szlaufy", "456-980-123", "APR123456"));
	}

	public TAplikacja(boolean start){
		// Dodanie na sztywno 1 pracownika ze wzgledu na brak bazy danych na tym etapie
		listaPracownik.add(new TPracownik(1, "Pawel", "Kowalski"));
		listaKlient.add(new TKlient(1, "Jan", "Klocek", 981108023, "ul. Kobry 11", "99500", "Szlaufy", "456-980-123", "APR123456"));
		operationMenu();
	}
}
import java.util.ArrayList;
import java.util.List;

public class TKlient {

	private int idKlient;
	private String imie;
	private String nazwisko;
	private long pesel;
	private String ulica;
	private String kodPocztowy;
	private String miejscowosc;
	private String telefon;
	private String dowod;
	public List<TLokata> listaLokat = new ArrayList<>();
	public List<TKredyt> listaKredytow = new ArrayList<>();
	public List<TKonto> listaKont = new ArrayList<>();

	public int getIdKlient() {
		return this.idKlient;
	}

	/**
	 *
	 * @param idKlient
	 */
	public void setIdKlient(int idKlient) {
		this.idKlient = idKlient;
	}

	public String getImie() {
		return this.imie;
	}

	/**
	 *
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 *
	 * @param nazwisko
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public long getPesel() {
		return this.pesel;
	}

	/**
	 *
	 * @param pesel
	 */
	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public String getUlica() {
		return this.ulica;
	}

	/**
	 *
	 * @param ulica
	 */
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getKodPocztowy() {
		return this.kodPocztowy;
	}

	/**
	 *
	 * @param kodPocztowy
	 */
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public String getMiejscowosc() {
		return this.miejscowosc;
	}

	/**
	 *
	 * @param miejscowosc
	 */
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getTelefon() {
		return this.telefon;
	}

	/**
	 *
	 * @param telefon
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDowod() {
		return this.dowod;
	}

	/**
	 *
	 * @param dowod
	 */
	public void setDowod(String dowod) {
		this.dowod = dowod;
	}

	public String getNrRachunku() {
		// TODO - implement TKlient.getNrRachunku
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param nrRachunku
	 */
	public void setNrRachunku(String nrRachunku) {
		// TODO - implement TKlient.setNrRachunku
		throw new UnsupportedOperationException();
	}

	public boolean checkPesel(long pesel){
		long l1 = pesel/10000000000L % 10;
		long l2 = pesel/1000000000 % 10;
		long l3 = pesel/100000000 % 10;
		long l4 = pesel/10000000 % 10;
		long l5 = pesel/1000000 % 10;
		long l6 = pesel/100000 % 10;
		long l7 = pesel/10000 % 10;
		long l8 = pesel/1000 % 10;
		long l9 = pesel/100 % 10;
		long l10 = pesel/10 % 10;
		long l11 = pesel % 10;

//		System.out.print(l1 + " ");
//		System.out.print(l2 + " ");
//		System.out.print(l3 + " ");
//		System.out.print(l4 + " ");
//		System.out.print(l5 + " ");
//		System.out.print(l6 + " ");
//		System.out.print(l7 + " ");
//		System.out.print(l8 + " ");
//		System.out.print(l9 + " ");
//		System.out.print(l10 + " ");
//		System.out.print(l11 + " ");

		int suma = (int) (l1 + l2*3 + l3*7 + l4*9 + l5 + l6*3 + l7*7 + l8*9 + l9 + l10*3);

		if ((10 - suma % 10)%10 == l11){
			return true;
		}
		else {
			return false;
		}
	}

	public boolean sprawdzTelefon(String telefon){
		if (telefon.length() == 9){
			return true;
		}
		else {
			return false;
		}
	}

	public boolean sprawdzKod(String kod){
		char table[] = kod.toCharArray();
		List<Character> kodTable = new ArrayList<>();
		for (int i = 0; i < kod.length(); i++){
			kodTable.add(i, table[i]);
		}
		if ((kodTable.get(2) == '-' && kodTable.size() == 6) || (!(kodTable.contains('-')) && kodTable.size() == 5)){
			return true;
		}
		else {
			return false;
		}
	}

	public TKlient(long pesel) {
		this.pesel = pesel;
	}

	public TKlient(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

	public TKlient() {

	}

	public TKlient(String imie, String nazwisko, long pesel, String ulica, String kodPocztowy, String miejscowosc, String telefon) {
		setImie(imie);
		setNazwisko(nazwisko);
		setPesel(pesel);
		setUlica(ulica);
		setKodPocztowy(kodPocztowy);
		setMiejscowosc(miejscowosc);
		setTelefon(telefon);
		//listaKont.add(new TKonto(001, 200100));
		//listaLokat.add(new TLokata(0, new Date(2018, 4, 21), 1000, 3));
	}

	public TKlient(int id, String imie, String nazwisko, long pesel, String ulica, String kodPocztowy, String miejscowosc, String telefon, String dowod) {
		setIdKlient(id);
		setImie(imie);
		setNazwisko(nazwisko);
		setPesel(pesel);
		setUlica(ulica);
		setKodPocztowy(kodPocztowy);
		setMiejscowosc(miejscowosc);
		setTelefon(telefon);
		setDowod(dowod);
		//listaKont.add(new TKonto(001, 200100));
		//listaLokat.add(new TLokata(0, new Date(2018, 4, 21), 1000, 3));
	}

}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKlient {

	private int idKlient;
	private String imie;
	private String nazwisko;
	private long pesel;
	private String adres;
	private int kodPocztowy;
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

	public String getAdres() {
		return this.adres;
	}

	/**
	 *
	 * @param adres
	 */
	public void setAdres(String adres) {
		this.adres = adres;
	}

	public int getKodPocztowy() {
		return this.kodPocztowy;
	}

	/**
	 *
	 * @param kodPocztowy
	 */
	public void setKodPocztowy(int kodPocztowy) {
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

	public TKlient() {
		// TODO - implement TKlient.TKlient
		throw new UnsupportedOperationException();
	}

	public TKlient(int id, String imie, String nazwisko, long pesel, String adres, int kodPocztowy, String miejscowosc, String telefon, String dowod) {
		setIdKlient(id);
		setImie(imie);
		setNazwisko(nazwisko);
		setPesel(pesel);
		setAdres(adres);
		setKodPocztowy(kodPocztowy);
		setMiejscowosc(miejscowosc);
		setTelefon(telefon);
		setDowod(dowod);
		listaKont.add(new TKonto(001, 200100));
		listaLokat.add(new TLokata(0, new Date(2018, 4, 21), 1000, 3));
	}

}
import java.util.ArrayList;
import java.util.List;

public class TPracownik {

	public List<TWniosek> listaWnioskow = new ArrayList<>();
	private int idPracownik;
	private String imie;
	private String nazwisko;

	public int getIdPracownik() {
		return this.idPracownik;
	}

	/**
	 *
	 * @param idPracownik
	 */
	public void setIdPracownik(int idPracownik) {
		this.idPracownik = idPracownik;
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

	public TPracownik() {
		// TODO - implement TPracownik.TPracownik
		throw new UnsupportedOperationException();
	}

	public TPracownik(int id, String imie, String nazwisko){
		setIdPracownik(id);
		setImie(imie);
		setNazwisko(nazwisko);

	}

}
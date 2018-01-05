import java.util.Date;

public class TWniosek extends TKredyt {

	private int idWniosek;
	private boolean zlozonoZasDoch;
	private Date dataZlozenia;
	private Date dataRopatrzenia;
	private float dochod;
	private int liczbaCzlonkowRodziny;
	private boolean czyPoprawny;
	private boolean czyZdolnosc;
	private TPracownik pracownik;

	public TWniosek(int idWniosek, String cel, long kwota, int okres, String ubezpieczenie, boolean zlozonoZasDoch, Date dataZlozenia, float dochod, int liczbaCzlonkowRodziny) {
		this.idWniosek = idWniosek;
		this.zlozonoZasDoch = zlozonoZasDoch;
		this.dataZlozenia = dataZlozenia;
		this.dochod = dochod;
		this.liczbaCzlonkowRodziny = liczbaCzlonkowRodziny;
		setCel(cel);
		setKwota(kwota);
		setOkres(okres);
		setUbezpieczenie(ubezpieczenie);
	}

	public int getIdWniosek() {
		return this.idWniosek;
	}

	/**
	 *
	 * @param idWniosek
	 */
	public void setIdWniosek(int idWniosek) {
		this.idWniosek = idWniosek;
	}

	public boolean getZlozonoZasDoch() {
		return this.zlozonoZasDoch;
	}

	/**
	 *
	 * @param zlozonoZasDoch
	 */
	public void setZlozonoZasDoch(boolean zlozonoZasDoch) {
		this.zlozonoZasDoch = zlozonoZasDoch;
	}

	public boolean getCzyPoprawny() {
		return this.czyPoprawny;
	}

	/**
	 *
	 * @param czyPoprawny
	 */
	public void setCzyPoprawny(boolean czyPoprawny) {
		this.czyPoprawny = czyPoprawny;
	}

	public Date getDataZlozenia() {
		return this.dataZlozenia;
	}

	/**
	 *
	 * @param dataZlozenia
	 */
	public void setDataZlozenia(Date dataZlozenia) {
		this.dataZlozenia = dataZlozenia;
	}

	public Date getDataRopatrzenia() {
		return this.dataRopatrzenia;
	}

	/**
	 *
	 * @param dataRopatrzenia
	 */
	public void setDataRopatrzenia(Date dataRopatrzenia) {
		this.dataRopatrzenia = dataRopatrzenia;
	}

	public float getDochod() {
		return this.dochod;
	}

	/**
	 *
	 * @param dochod
	 */
	public void setDochod(float dochod) {
		this.dochod = dochod;
	}

	public int getLiczbaCzlonkowRodziny() {
		return this.liczbaCzlonkowRodziny;
	}

	/**
	 *
	 * @param liczbaCzlonkowRodziny
	 */
	public void setLiczbaCzlonkowRodziny(int liczbaCzlonkowRodziny) {
		this.liczbaCzlonkowRodziny = liczbaCzlonkowRodziny;
	}

	public boolean getCzyZdolnosc() {
		return this.czyZdolnosc;
	}

	/**
	 *
	 * @param czyZdolnosc
	 */
	public void setCzyZdolnosc(boolean czyZdolnosc) {
		this.czyZdolnosc = czyZdolnosc;
	}

	public boolean czyPoprawny() {
		// TODO - implement TWniosek.czyPoprawny
		throw new UnsupportedOperationException();
	}

	public boolean czyZdolnoscKredytowa() {
		// TODO - implement TWniosek.czyZdolnoscKredytowa
		throw new UnsupportedOperationException();
	}

	public TWniosek() {
	}

	@Override
	public String toString() {
		return "TWniosek{" +
				"idWniosek=" + idWniosek +
				", zlozonoZasDoch=" + zlozonoZasDoch +
				", dataZlozenia=" + dataZlozenia +
				", dochod=" + dochod +
				", liczbaCzlonkowRodziny=" + liczbaCzlonkowRodziny +
				'}';
	}
}
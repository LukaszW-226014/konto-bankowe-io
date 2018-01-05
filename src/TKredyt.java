import java.util.Date;

public class TKredyt {

	private long kwota;
	private String cel;
	private int okres;
	private String ubezpieczenie;
	private Date dataZakonczenia;
	private Date dataRozpoczecia;
	private boolean czyZalega;

	public TKredyt(long kwota, String cel, int okres, String ubezpieczenie, Date dataZakonczenia, Date dataRozpoczecia) {
		this.kwota = kwota;
		this.cel = cel;
		this.okres = okres;
		this.ubezpieczenie = ubezpieczenie;
		this.dataZakonczenia = dataZakonczenia;
		this.dataRozpoczecia = dataRozpoczecia;
	}

	public long getKwota() {
		return this.kwota;
	}

	/**
	 *
	 * @param kwota
	 */
	public void setKwota(long kwota) {
		this.kwota = kwota;
	}

	public String getCel() {
		return this.cel;
	}

	/**
	 *
	 * @param cel
	 */
	public void setCel(String cel) {
		this.cel = cel;
	}

	public int getOkres() {
		return this.okres;
	}

	/**
	 *
	 * @param okres
	 */
	public void setOkres(int okres) {
		this.okres = okres;
	}

	public String getUbezpieczenie() {
		return this.ubezpieczenie;
	}

	/**
	 *
	 * @param ubezpieczenie
	 */
	public void setUbezpieczenie(String ubezpieczenie) {
		this.ubezpieczenie = ubezpieczenie;
	}

	public boolean getCzyZalega() {
		return this.czyZalega;
	}

	/**
	 *
	 * @param czyZalega
	 */
	public void setCzyZalega(boolean czyZalega) {
		this.czyZalega = czyZalega;
	}

	public Date getDataZakonczenia() {
		return this.dataZakonczenia;
	}

	/**
	 *
	 * @param dataZakonczenia
	 */
	public void setDataZakonczenia(Date dataZakonczenia) {
		this.dataZakonczenia = dataZakonczenia;
	}

	public Date getDataRozpoczecia() {
		return this.dataRozpoczecia;
	}

	/**
	 *
	 * @param dataRozpoczecia
	 */
	public void setDataRozpoczecia(Date dataRozpoczecia) {
		this.dataRozpoczecia = dataRozpoczecia;
	}

	public boolean czyZalega() {
		// TODO - implement TKredyt.czyZalega
		throw new UnsupportedOperationException();
	}

	public TKredyt() {
	}

}
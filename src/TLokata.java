import java.util.Date;

public class TLokata {

	private int idLokata;
	private Date dataZakonczenia;
	private long kwota;
	private float oprocentowanie;

	public TLokata(int idLokata, Date dataZakonczenia, long kwota, float oprocentowanie) {
		this.idLokata = idLokata;
		this.dataZakonczenia = dataZakonczenia;
		this.kwota = kwota;
		this.oprocentowanie = oprocentowanie;
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

	public int getIdLokata() {
		return this.idLokata;
	}

	/**
	 *
	 * @param idLokata
	 */
	public void setIdLokata(int idLokata) {
		this.idLokata = idLokata;
	}

	public float getOprocentowanie() {
		return this.oprocentowanie;
	}

	/**
	 *
	 * @param oprocentowanie
	 */
	public void setOprocentowanie(float oprocentowanie) {
		this.oprocentowanie = oprocentowanie;
	}

	public TLokata() {
	}

	@Override
	public String toString() {
		return "TLokata{" +
				"idLokata=" + idLokata +
				", dataZakonczenia=" + dataZakonczenia +
				", kwota=" + kwota +
				", oprocentowanie=" + oprocentowanie +
				'}';
	}
}
import java.util.Date;

public class TTransakcja {

	private int idTransakcja;
	private Date dataZlecenia;
	private String typ;
	private Date dataZaksiegowania;

	public TTransakcja(int idTransakcja, Date dataZlecenia, String typ, Date dataZaksiegowania) {
		this.idTransakcja = idTransakcja;
		this.dataZlecenia = dataZlecenia;
		this.typ = typ;
		this.dataZaksiegowania = dataZaksiegowania;
	}

	public int getIdTransakcja() {
		return this.idTransakcja;
	}

	/**
	 *
	 * @param idTransakcja
	 */
	public void setIdTransakcja(int idTransakcja) {
		this.idTransakcja = idTransakcja;
	}

	public Date getDataZlecenia() {
		return this.dataZlecenia;
	}

	/**
	 *
	 * @param dataZlecenia
	 */
	public void setDataZlecenia(Date dataZlecenia) {
		this.dataZlecenia = dataZlecenia;
	}

	public String getTyp() {
		return this.typ;
	}

	/**
	 *
	 * @param typ
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	public Date getDataZaksiegowania() {
		return this.dataZaksiegowania;
	}

	/**
	 *
	 * @param dataZaksiegowania
	 */
	public void setDataZaksiegowania(Date dataZaksiegowania) {
		this.dataZaksiegowania = dataZaksiegowania;
	}

	@Override
	public String toString() {
		return "TTransakcja{" +
				"idTransakcja: " + idTransakcja +
				", dataZlecenia: " + dataZlecenia +
				", typ: '" + typ + '\'' +
				", dataZaksiegowania: " + dataZaksiegowania +
				'}';
	}
}
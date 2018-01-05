import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKonto {

	private int nrRachunku;
	private float saldo;
	public List<TTransakcja> listaTransakcja = new ArrayList<>();

	public TKonto(int nrRachunku, float saldo) {
		this.nrRachunku = nrRachunku;
		this.saldo = saldo;
		listaTransakcja.add(new TTransakcja(1, new Date(2017,11,29), "Przelew", new Date(2017,12,2)));
	}

	public TKonto() {
	}

	public int getNrRachunku() {
		return this.nrRachunku;
	}

	/**
	 *
	 * @param nrRachunku
	 */
	public void setNrRachunku(int nrRachunku) {
		this.nrRachunku = nrRachunku;
	}

	public float getSaldo() {
		return this.saldo;
	}

	/**
	 *
	 * @param saldo
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "TKonto{" +
				"nrRachunku=" + nrRachunku +
				", saldo=" + saldo +
				'}';
	}
}
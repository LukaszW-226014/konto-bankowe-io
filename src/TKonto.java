import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TKonto {

	public String getNrRachunku() {
		return nrRachunku;
	}

	public void setNrRachunku(String nrRachunku) {
		this.nrRachunku = nrRachunku;
	}

	private String nrRachunku;
	private float saldo;

	public TKonto(float saldo) {
		this.saldo = saldo;
	}

	public TKonto(String nrRachunku) {
		this.nrRachunku = nrRachunku;
	}

	public List<TTransakcja> listaTransakcja = new ArrayList<>();

	public TKonto(String nrRachunku, float saldo) {
		this.nrRachunku = nrRachunku;
		this.saldo = saldo;
		listaTransakcja.add(new TTransakcja(1, new Date(2017,11,29), "Przelew", new Date(2017,12,2)));
	}

	public TKonto() {
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
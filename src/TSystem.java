import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class TSystem {


	public TSystem() {
		TAplikacja app = new TAplikacja();
		czyLokatyZakonczone(app);
	}

	public void czyLokatyZakonczone(TAplikacja app) {
		for (TLokata lokata: app.listaKlient.get(0).listaLokat) {
			Calendar calendar = Calendar.getInstance();
			Date time = calendar.getTime();
			if (lokata.getDataZakonczenia() == time){
				app.listaKlient.get(0).listaKont.get(0).setSaldo(app.listaKlient.get(0).listaKont.get(0).getSaldo() + (lokata.getOprocentowanie()*lokata.getKwota()));
			}
		}
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		new TSystem();
	}

}
public class FitnesseKodTest {
    String kodPocztowy;
    boolean result;

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void execute(){
        TAplikacja app = new TAplikacja();
        TKlient klient = new TKlient(kodPocztowy);

        this.result = klient.sprawdzKod(klient.getKodPocztowy());
    }

    public boolean result(){
        return this.result;
    }
}

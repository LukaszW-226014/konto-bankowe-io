public class FitnessePeselTest {
    long pesel;
    boolean result;

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public void execute(){
        TAplikacja app = new TAplikacja();
        TKlient klient = new TKlient(pesel);
        this.result = klient.checkPesel(klient.getPesel());
    }

    public boolean result(){
        return this.result;
    }
}

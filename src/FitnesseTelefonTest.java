public class FitnesseTelefonTest {
    String telefon;
    boolean result;

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void execute(){
        TKlient klient = new TKlient();
        klient.setTelefon(telefon);

        this.result = klient.sprawdzTelefon(klient.getTelefon());
    }

    public boolean result(){
        return this.result;
    }
}

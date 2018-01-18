public class FitnesseNowyKlientTest {
    String imie;
    String nazwisko;
    long pesel;
    String ulica;
    String kodPocztowy;
    String miejscowosc;
    String telefon;
    boolean result;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void execute(){
        TAplikacja app = new TAplikacja();
        TKlient klient = new TKlient();

        if (klient.checkPesel(pesel) && klient.sprawdzKod(kodPocztowy) && klient.sprawdzTelefon(telefon)){
            this.result = true;
        }
        else {
            this.result = false;
        }
    }

    public boolean result(){
        return this.result;
    }
}

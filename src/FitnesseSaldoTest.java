public class FitnesseSaldoTest {
    float kwota;
    float saldo;
    boolean result;

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void execute(){
        TKonto konto = new TKonto(saldo);
        TAplikacja app = new TAplikacja();
        this.result = app.sprawdzSaldo(kwota, konto);
    }

    public boolean result(){
        return this.result;
    }
}

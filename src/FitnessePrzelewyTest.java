public class FitnessePrzelewyTest {
    float kwota;
    float saldoKonta1;
    float saldoKonta2;


    boolean result;

    public void setKwota(float kwota) {
        this.kwota = kwota;
    }

    public void setSaldoKonta1(float saldoKonta1) {
        this.saldoKonta1 = saldoKonta1;
    }

    public void setSaldoKonta2(float saldoKonta2) {
        this.saldoKonta2 = saldoKonta2;
    }

    public void execute(){
        TAplikacja app = new TAplikacja();
        TKonto konto1 = new TKonto(saldoKonta1);
        TKonto konto2 = new TKonto(saldoKonta2);
        this.result = app.przelejSrodki(kwota, konto1, konto2);
        this.saldoKonta1 = konto1.getSaldo();
        this.saldoKonta2 = konto2.getSaldo();
    }

    public boolean resultUdany(){
        return this.result;
    }

    public float saldoKonta1(){
        return this.saldoKonta1;
    }

    public float saldoKonta2(){
        return this.saldoKonta2;
    }
}

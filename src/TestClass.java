import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;


public class TestClass {

    TAplikacja app = new TAplikacja();


    @Test
    public void przelewUdany() throws Exception {
        System.out.println("test mozliwy przelew");

        float saldoKonta1 = 5000.3f;
        float saldoKonta2 = 2000.1f;
        float kwota = 1000.2f;
        TKonto konto1 = new TKonto(saldoKonta1);
        TKonto konto2 = new TKonto(saldoKonta2);

        assertTrue(app.przelejSrodki(kwota, konto1, konto2));

        assertEquals(4000.1f, konto1.getSaldo(), 0.01f);

        assertEquals(3000.3f, konto2.getSaldo(), 0.01f);
    }

    @Test
    public void przelewNieudany() throws Exception {
        System.out.println("test niemozliwy przelew");

        float saldoKonta1 = 5000.3f;
        float saldoKonta2 = 3000.1f;
        float kwota = 6000.2f;
        TKonto konto1 = new TKonto(saldoKonta1);
        TKonto konto2 = new TKonto(saldoKonta2);

        assertFalse(app.przelejSrodki(kwota, konto1, konto2));

        assertEquals(saldoKonta1, konto1.getSaldo(), 0.01f);

        assertEquals(saldoKonta2, konto2.getSaldo(), 0.01f);
    }

    @Test
    public void czyDaneOdpowiednioZapisane(){
        System.out.println("test czy dane odpowiednio zapisane");

        int id = 143562;
        String imie = "Mateusz";
        String nazwisko = "Dzbanek";
        long pesel = 49040501580L;
        String adres = "Koszarowa 5";
        int kodPocztowy = 55160;
        String miejscowosc = "Warszawa";
        String telefon = "561234123";
        String dowod = "AZF1234";

        TKlient klient = new TKlient(id, imie, nazwisko, pesel, adres, kodPocztowy, miejscowosc, telefon, dowod);

        assertEquals(id, klient.getIdKlient());

        assertEquals(imie, klient.getImie());

        assertEquals(nazwisko, klient.getNazwisko());

        assertEquals(pesel, klient.getPesel());

        assertEquals(adres, klient.getAdres());

        assertEquals(kodPocztowy, klient.getKodPocztowy());

        assertEquals(miejscowosc, klient.getMiejscowosc());

        assertEquals(telefon, klient.getTelefon());

        assertEquals(dowod, klient.getDowod());
    }

    @Test
    public void sprawdzPoprawnyPesel(){
        System.out.println("test poprawnego pesel");

        long pesel = 49040501580L;
        TKlient klient = new TKlient(pesel);

        assertTrue(klient.checkPesel(klient.getPesel()));
    }

    @Test
    public void sprawdzNiepoprawnyPesel(){
        System.out.println("test niepoprawnego pesel");

        long pesel = 49040501581L;
        TKlient klient = new TKlient(pesel);

        assertFalse(klient.checkPesel(klient.getPesel()));
    }

    @Test
    public void sprawdzPoprawnoscUdzieleniaKredytu(){
        System.out.println("test poprawnosc udzielenia kredytu");

        TKonto konto = new TKonto(2500f);
        int kwotaKredytu = 100000;

        app.udzielKredytu(0, kwotaKredytu, konto);
        assertEquals(102500, konto.getSaldo(), 0.0);
    }


    @Test
    public void sprawdzSaldoWystarczajace() throws Exception {
        System.out.println("test saldo wystarczajace");

        float saldo = 5000.1f;
        float kwota = 2000.3f;
        TKonto konto = new TKonto(saldo);

        assertTrue(app.sprawdzSaldo(kwota, konto));
    }

    @Test
    public void sprawdzSaldoNiewystarczajace() throws Exception {
        System.out.println("test saldo niewystarczajace");

        float saldo = 5000.1f;
        float kwota = 6000.7f;
        TKonto konto = new TKonto(saldo);

        assertFalse(app.sprawdzSaldo(kwota, konto));
    }

    @Test
    public void spradzCzyTrudnyKlient(){
        System.out.println("test klienta czy trudny klient");

        TKlient klient = new TKlient();
        TKonto konto = new TKonto(-500f);

        assertTrue(app.czyZalega(konto.getSaldo()));
    }

    @Test
    public void sprawdzZarzadzaniaPamieca(){
        System.out.println("test zarzadzania pamiecia");

        TKonto konto = new TKonto("PL83101010230000261395100000", 2500f);
        String first = konto.getNrRachunku();
        app.udzielKredytu(0, 10000, konto);
        String second = konto.getNrRachunku();

        assertSame(first, second);
    }

    @Test
    public void sprawdzZakonczenieLokaty(){
        System.out.println("test zakonczenia lokaty");

        int idLokata = 0;
        Date dataZakonczenia = new Date(118, 0, 18, 12, 10);
        float kwota = 4000f;
        float oprocentowanie = 0.03f;

        TLokata lokata = new TLokata(idLokata, dataZakonczenia, kwota, oprocentowanie);

        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();

        assertTrue(app.czyLokatyZakonczone(lokata, time));
    }

    @Test
    public void sprawdzTrwanieLokaty(){
        int idLokata = 0;
        Date dataZakonczenia = new Date(119, 0, 18, 12, 10);
        float kwota = 4000f;
        float oprocentowanie = 0.03f;

        TLokata lokata = new TLokata(idLokata, dataZakonczenia, kwota, oprocentowanie);

        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();

        assertFalse(app.czyLokatyZakonczone(lokata, time));
    }

    @Test
    public void sprawdzWyciag(){
        System.out.println("test wyciagu");

        List<TTransakcja> listaTransakcji = new ArrayList<>();
        listaTransakcji.add(new TTransakcja(0, new Date(117, 11, 22, 9, 59), "przelew out", new Date(117, 11, 22, 12, 1)));
        listaTransakcji.add(new TTransakcja(1, new Date(118, 0, 5, 19, 12), "przelew in", new Date(118, 0, 6, 9, 1)));
        listaTransakcji.add(new TTransakcja(2, new Date(118, 0, 18, 11, 11), "przelew out", new Date(118, 0, 18, 12, 01)));

        assertEquals(listaTransakcji, app.pobierzWyciag(listaTransakcji));
    }

    @Test
    public void sprawdzPoprawnoscNrTelefonu(){
        System.out.println("test poprawnego numeru tel");

        TKlient klient = new TKlient();
        klient.setTelefon("123456789");

        assertEquals(9, klient.getTelefon().length());
    }

    @Test
    public void sprawdzNiepoprawnoscNrTelefonu(){
        System.out.println("test niepoprawnego numeru tel");


        TKlient klient = new TKlient();
        klient.setTelefon("12345678");

        assertNotEquals(9, klient.getTelefon().length());
    }

    @Test
    public void zalozenieLokaty() throws Exception {
    }

    @Test
    public void zerwijLokate() throws Exception {

    }

    @Test
    public void zalozKonto() throws Exception {

    }

    @Test
    public void zamknijKonto() throws Exception {
    }

    @Test
    public void zlozenieWnioskuKredytowego() throws Exception {
    }

    @Test
    public void weryfikacjaWnioskuKredytowego() throws Exception {
    }

    @Test
    public void udzielKredytu() throws Exception {
    }

    @Test
    public void pobierzWyciag() throws Exception {
    }
}
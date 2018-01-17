import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;


public class TAplikacjaTest {

    TAplikacja app = new TAplikacja();

    @Test
    public void przelejSrodki() throws Exception {
    }

    @Test
    public void zalozenieLokaty() throws Exception {
    }

    @Test
    public void sprawdzSaldoWystarczajace() throws Exception {
        System.out.println("sprawdz saldo wystarczajace");
        TKonto konto = new TKonto(5000);

        assertTrue(app.sprawdzSaldo(2000, konto));
    }

    @Test
    public void sprawdzSaldoNiewystarczajace() throws Exception {
        System.out.println("sprawdz saldo niewystarczajace");
        TKonto konto = new TKonto(5000);

        assertFalse(app.sprawdzSaldo(6000, konto));
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
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TAplikacjaTest {

    @Parameter
    public List<TKlient> listaKlient = new ArrayList<>();

    @Parameter
    private List<TPracownik> listaPracownik = new ArrayList<>();

    @Before
    public void setUp(){
        listaPracownik.add(new TPracownik(1, "Pawel", "Kowalski"));
        listaKlient.add(new TKlient(1, "Jan", "Klocek", 981108023, "ul. Kobry 11", 99500, "Szlaufy", "456-980-123", "APR123456"));
    }

    @Test
    public void przelejSrodki() throws Exception {
    }

    @Test
    public void zalozenieLokaty() throws Exception {
    }

    @Test
    public void sprawdzSaldo() throws Exception {
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
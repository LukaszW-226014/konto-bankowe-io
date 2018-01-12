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

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TAplikacjaTest {

    @Parameter
    public List<TKlient> listaKlient = new ArrayList<>();

    @Parameter
    private List<TPracownik> listaPracownik = new ArrayList<>();

    @Parameter
    private static int nrRachunku[] = {2312, 31232, 232131};

    @Parameter
    private static long kwota[] = {13212, 21312414, 12412441};

    @Parameters
    public static Collection<Object[]> data(){
        Object[][] data1 = new Object[][]{{9990, 39404}, {374, 38239}, {132, 38811}};
        return Arrays.asList(data1);
    }

    @Before
    public void setUpClass(){
        System.out.println("Set up class");
        listaPracownik.add(new TPracownik(1, "Pawel", "Kowalski"));
        listaKlient.add(new TKlient(1, "Jan", "Klocek", 981108023, "ul. Kobry 11", 99500, "Szlaufy", "456-980-123", "APR123456"));
    }

    @Before
    public void setUp(){
        System.out.println("start test");
    }

    @After
    public void tearDown(){
        System.out.println("end test");
        System.out.flush();
    }

    @Test
    public void przelejSrodki() throws Exception {
        TAplikacja app = new TAplikacja();

        for (int i = 0; i < nrRachunku.length; i++) {
            for (int j = 0; j < kwota.length; j++) {
                app.przelejSrodki(nrRachunku[i], kwota[j]);
            }
        }
    }

    @Test
    public void zalozenieLokaty() throws Exception {
    }

    @Test
    public void sprawdzSaldo() throws Exception {
        TAplikacja app = new TAplikacja();
        for (int i = 0; i < kwota.length; i++) {
                Assert.assertNotNull(app.sprawdzSaldo(kwota[i]));
        }
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
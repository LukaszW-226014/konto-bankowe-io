import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class MockitTestClass {
    TAplikacja app;

    @Mocked
    long pesel;

    @Before
    public void setUp(){
        app = new TAplikacja();
    }

    @Test
    public void anyPeselCheck(){
        TKlient klient = new TKlient();

        new Expectations() {{
            klient.checkPesel(pesel); result = true;
            klient.checkPesel(pesel); result = false;
            klient.checkPesel(pesel); result = true;
        }};
    }
}

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InternetRadioTest {

    InternetRadio internetRadio;

    @Before
    public void before() {
        internetRadio = new InternetRadio();
        }

    @Test
    public void canTune() {
        assertEquals("You are tuned into: Internet Radio", internetRadio.connect("Internet Radio"));
    }



}

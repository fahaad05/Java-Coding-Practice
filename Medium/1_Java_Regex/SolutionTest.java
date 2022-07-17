import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private MyRegex s;

    @Before
    public void setup(){
        s = new MyRegex();
    }

    @Test
    public void testIsIP(){
        assertTrue(s.isIP("000.12.12.034"));
        assertTrue(s.isIP("121.234.12.12"));
        assertTrue(s.isIP("23.45.12.56"));
        assertFalse(s.isIP("000.12.234.23.23"));
        assertFalse(s.isIP(".213.123.23.32"));
        assertFalse(s.isIP("I.Am.not.an.ip"));
    }
}

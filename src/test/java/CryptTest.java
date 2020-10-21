import org.junit.Test;
import static org.junit.Assert.*;

public class CryptTest {

    @Test
    public void testIfWorks(){
        assertEquals(0.0, CodeupCryptTest.version, 0);
    }

    @Test
    public void testIfSetterforVersionWorks(){
        assertEquals(0.0, CodeupCryptTest.version, 0);
        CodeupCryptTest.version = 1.0;
        assertEquals(1.0, CodeupCryptTest.version, 0);

    }

}

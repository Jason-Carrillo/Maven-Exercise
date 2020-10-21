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
        assertNotEquals(0.0, CodeupCryptTest.version, 0);

    }

    @Test
    public void hashPassword(){
        assertEquals("C0d39p", CodeupCryptTest.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCryptTest.hashPassword("Fer"));
        assertEquals("123", CodeupCryptTest.hashPassword("123"));
        assertEquals("124", CodeupCryptTest.hashPassword("12a"));

    }

    @Test
    public void checkIfCheckPasswordWorks(){
        assertTrue(CodeupCryptTest.checkPassword("fer", "f3r"));


    }


}

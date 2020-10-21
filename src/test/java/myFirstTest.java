import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class myFirstTest {

    @Test
    public void testStrings() {
        String a = "Codeup";
        String b = "Codeup";

        assertEquals(a, b);
        assertNotEquals(a, b.toLowerCase());
    }

    @Test
    public void testIfListsTheSame(){
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();

        assertNotSame(a ,b);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        assertArrayEquals(a, b);

    }


}

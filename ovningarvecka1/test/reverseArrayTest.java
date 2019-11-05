import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class reverseArrayTest {
    @Test
    public void testReverse(){
        Integer[] a = {1};
        Integer[] b = {1};
        reverseArray.reverse(a);
        assertTrue(Arrays.equals(a, b));
        a = new Integer[]{1,2};
        b = new Integer[]{2,1};
        reverseArray.reverse(a);
        assertTrue(Arrays.equals(a, b));
        Double[] da = new Double[]{1.0,2.0,3.0};
        Double[] db = new Double[]{3.0,2.0,1.0};
        reverseArray.reverse(da);
        assertTrue(Arrays.equals(da, db));
        a = new Integer[]{1,2,3,4};
        b = new Integer[]{4,3,2,1};
        reverseArray.reverse(a);
        assertTrue(Arrays.equals(a, b));
    }
}

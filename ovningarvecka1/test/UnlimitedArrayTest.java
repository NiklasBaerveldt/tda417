import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnlimitedArrayTest {

    @Test
    void get() {
        UnlimitedArray<Integer> unlimitedArray = new UnlimitedArray<>(1);
        Integer integer= unlimitedArray.get(1);
        boolean isNull = integer == null;
        assertTrue(isNull);
    }

    @Test
    void set() {
        UnlimitedArray<Integer> unlimitedArray = new UnlimitedArray<>(1);
        unlimitedArray.set(0,1);
        Integer integer = unlimitedArray.get(0);
        boolean isOne = integer == 1;
        unlimitedArray.set(58,32);
        integer = unlimitedArray.get(58);
        boolean is32 = integer == 32;
        assertTrue(isOne && is32);
    }
}
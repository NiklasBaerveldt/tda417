import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class circularRotationTest {
    @Test
    public void testCircularRotation(){
        String s = "HEJSAN";
        String t = rotateCircularly(s,5);
        assertTrue(circularRotation.isCircularlyRotated(s,t));
        assertFalse(circularRotation.isCircularlyRotated("AB","BA"));
        assertFalse(circularRotation.isCircularlyRotated("A", "AA"));
        assertTrue(circularRotation.isCircularlyRotated("",""));
    }

    @Test
    public void testRotatCircularly(){
        String s = "HEJ";
        String t = rotateCircularly(s,1);
        assertTrue(t.equals("JHE"));
    }

    private String rotateCircularly(String s, int rotation){
        int len = s.length();
        char[] chars = new char[len];
        for(int i = 0; i < len;i++){
            chars[(i+rotation)%len]= s.charAt(i);
        }
        return new String(chars);
    }
}
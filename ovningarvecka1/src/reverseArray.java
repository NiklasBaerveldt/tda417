import java.util.ArrayList;

public class reverseArray {
    public static <T> T[] reverse(T[] array){
        int len = array.length;
        T temp;
        for(int i = 0; i < len/2; i++){
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        return array;
    }
}

public class circularRotation {
    public static boolean isCircularlyRotated(String s, String t){
        int len = s.length();
        if(len != t.length()){
            return false;
        }

        t=t+t;

        if(t.contains(s)){
            return true;
        }
        else{
            return false;
        }
    }
}

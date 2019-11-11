public class IsPalindrome {
    public static boolean isPalindrome(String s){
        String sReversed = new StringBuilder(s).reverse().toString();
        return s.equals(sReversed);
    }

    public static boolean isPalindromeConsideringOnlyLetters(String s){
        String onlyUpperCaseLetters = "";
        int len = s.length();
        char c;
        for(int i = 0; i < len; i++){
            c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                onlyUpperCaseLetters += Character.toUpperCase(c);
            }
        }
        return isPalindrome(onlyUpperCaseLetters);
    }
}

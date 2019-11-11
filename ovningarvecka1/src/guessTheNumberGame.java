import java.util.Scanner;

public class guessTheNumberGame {
    public static void main(String[] args){
        long lo = 0;
        long hi = 10000;

        Scanner reader = new Scanner(System.in);
        boolean runGame = true;

        while(runGame) {

            System.out.println("is your number higher than " + hi + "? \"y\" or \"n\"");
            String ans = reader.nextLine();
            if (ans.equals("y")) {
                lo = hi;
                hi *= 2;
            } else if (ans.equals("n")) {
                foundHighestSection(reader,hi,lo);
                runGame = false;
            } else {
                System.out.println("Please enter your answer in the required form: \"y\" or \"n\"");
                System.out.print("Again: ");
            }

        }

    }


    private static void foundHighestSection(Scanner reader, long hi, long lo){
        boolean runGame = true;
        while(runGame) {

            System.out.println("is your number higher than " + ((hi - lo)/2 + lo) + "? \"y\" or \"n\"");
            String ans = reader.nextLine();
            if (ans.equals("y")) {
                    lo = (hi - lo) / 2 + lo + 1 ;
            } else if (ans.equals("n")) {
                hi = (hi - lo) / 2 + lo -1;
            } else {
                System.out.println("Please enter your answer in the required form: \"y\" or \"n\"");
                System.out.print("Again: ");
            }

            if (hi < lo) {
                if(hi == lo) System.out.println("hi = lo");
                System.out.println("Your number is:" + (hi + 1));
                runGame = false;
            }
        }
    }
}//algoritm: sätt lo till gamla hi, dubbla hi. gör om tills "n" kör sedan koden ovan
// test: gör om metoden så den letar efter ett tal istället

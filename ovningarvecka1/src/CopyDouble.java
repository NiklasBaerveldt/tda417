// Version of the file reading program that
// doubles the size of the array whenever it gets full.
// (Fast)
import java.io.*;

class StringReader {
    char[] string = new char[1];
    int size = 0;

    public void append(char c) {
        if (size == string.length) {
            // Create a new array, twice as big as before.
            double lengthPlus10percent = (double)string.length * 1.1;
            char[] newString = new char[(int) Math.ceil(lengthPlus10percent)];
            // Copy the old array there.
            for (int i = 0; i < string.length; i++)
                newString[i] = string[i];
            string = newString;
        }

        // Put the character at the end of the new array.
        string[size] = c;
        size++;
    }

    public String toString() {
        return new String(string, 0, size);
    }
}

public class CopyDouble {
    public static void main(String[] args) {
        StringReader reader = new StringReader();
        long prevTimeMillis = System.currentTimeMillis();

        try {
            int i = 0;

            // Read in characters one at a time.
            Character c = readChar();
            while (c != null) {
                reader.append(c);
                c = readChar();

                i++;
                if (i % 1000 == 0)
                    System.out.println("Read " + i + " characters");
            }

            System.out.print(reader);
            System.out.print(reader);
            long currentTimeMillis = System.currentTimeMillis();
            System.out.println("Time to run in milliseconds: " + (currentTimeMillis - prevTimeMillis));
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    static InputStreamReader in = new InputStreamReader(System.in);
    // Read one character from System.in, or return null on end-of-file.
    static Character readChar() throws IOException {
        int c = in.read();
        if (c == -1)
            return null;
        else
            return (char)c;
    }
}
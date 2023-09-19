import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q18 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q18.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            plusScores(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static void plusScores(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String name = inputScanner.nextLine();
            String plusMinusString = inputScanner.nextLine();

            int plusCount = 0;
            int totalCharacters = plusMinusString.length();

            for (int i = 0; i < totalCharacters; i++) {
                char character = plusMinusString.charAt(i);
                if (character == '+') {
                    plusCount++;
                }
            }

            double percent = (double) plusCount / totalCharacters * 100;
            System.out.print(name+": " +percent+"% plus");
            System.out.println();

        }
    }
}
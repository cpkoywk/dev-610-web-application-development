import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q14 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q14.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            printDuplicates(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

   public static void printDuplicates(Scanner inputScanner) {
        String previousWord = "";
        int n = 1;

        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();

            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                String currentWord = lineScanner.next();
                if (currentWord.equals(previousWord)) {
                    n++;
                } else {
                    if (n > 1) {
                        System.out.print(previousWord + "*" + n);
                    }
                    n = 1;
                }
                previousWord = currentWord;
            }
            System.out.println();
            lineScanner.close();
        }
        //consequtive words
        if (n > 1) {
            System.out.print(previousWord + "*" + n);
        }
    }
}
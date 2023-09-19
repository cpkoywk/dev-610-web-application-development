import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class e6q8 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q8.txt");
            Scanner input = new Scanner(f);
            PrintStream output = new PrintStream(new File("e6q8_output.txt"));
            doubleSpace(input, output);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
   public static void doubleSpace(Scanner inputScanner, PrintStream outputPrintStream) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            outputPrintStream.println(line);
            outputPrintStream.println();
        }
    }
}
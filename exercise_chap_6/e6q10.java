import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q10 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q10.txt");
            //for the assignment purpose, not gonna overwrite the original file
            File outputFile = new File("e6q10_output.txt");
            Scanner input = new Scanner(f);
            PrintWriter output = new PrintWriter(outputFile);

            wordWrap(input,output,30);

            output.flush();
            
            input.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

     public static void wordWrap(Scanner inputScanner, PrintWriter outputWriter, int lineLimit) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                if (i % lineLimit != 0) {
                    outputWriter.print(letter);
                } else {
                    outputWriter.println();
                    outputWriter.print(letter);
                }
            }
            outputWriter.println();
        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q11 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q11.txt");
            File outputFile = new File("e6q11_output.txt");
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
            int currentLineLength = 0;

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);

                if (Character.isWhitespace(currentChar)) {
                    if (currentLineLength > 0) {
                        outputWriter.print(" ");
                        currentLineLength++;
                    }
                } else {
                    outputWriter.print(currentChar);
                    currentLineLength++;
                }

             if (currentLineLength >= lineLimit) {
                    outputWriter.println();
                    currentLineLength = 0;
                }
            }
            if (currentLineLength > 0) {
                outputWriter.println();
            } else {
                outputWriter.println(); // Empty line
            }
        }
    }
}
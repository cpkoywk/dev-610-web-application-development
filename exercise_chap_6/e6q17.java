import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q17 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q17.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            inputStats(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
   public static void inputStats(Scanner inputScanner) {
        int lineNumber = 0;
        int longestLineLength = 0;
        String longestLine = "";

        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            lineNumber++;
            int lineLength = line.length();

            String[] tokens = line.split(" ");
            int tokenCount = tokens.length;
            int longestTokenLength = 0;
            
            for (String token : tokens) {
                if (token.length() > longestTokenLength) {
                    longestTokenLength = token.length();
                }
            }
            if (lineLength > longestLineLength) {
                longestLineLength = lineLength;
                longestLine = line;
            }
           System.out.println("Line " + lineNumber + " has " + tokenCount + " tokens (longest = "+longestTokenLength+")");
 
        }
        System.out.println("Longest line:" + longestLine);
    }
}
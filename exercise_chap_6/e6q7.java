import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e6q7 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q7.txt");
            Scanner input = new Scanner(f);
            flipLines(input);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
  public static void flipLines(Scanner inputScanner) {
        int lineNumber = 0;
        String currentLine = "";
        String previousLine = "";

        while (inputScanner.hasNextLine()) {
            currentLine = inputScanner.nextLine();
            if (lineNumber % 2 == 1) {
                if (lineNumber > 0) {
                    System.out.println(currentLine);
                    System.out.println(previousLine);
                } else {
                    System.out.println(currentLine);
                }
            } else {
                previousLine = currentLine;
            }
            lineNumber++;
        }
        if (lineNumber % 2 == 1) {
            System.out.println(currentLine);
        }
    }
}
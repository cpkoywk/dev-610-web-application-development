import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e6q5 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q5.txt");
            Scanner input = new Scanner(f);
           collapseSpaces(input);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static void collapseSpaces(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String collapsedLine = line.replaceAll("\\s+", " ");
            System.out.println(collapsedLine);
        }
    }

    }
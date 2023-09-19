import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e6q6 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q6.txt");
            Scanner input = new Scanner(f);
            System.out.println(readEntireFile(input));
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static String readEntireFile(Scanner inputScanner) {
        StringBuilder content = new StringBuilder();
        while (inputScanner.hasNextLine()) {
            content.append(inputScanner.nextLine()).append("\n");
        }
        return content.toString();
    }

    }

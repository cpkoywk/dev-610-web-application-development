import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q12 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q12.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);

            stripHtmlTags(input);
            
            //output.flush();
            
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

    public static void stripHtmlTags(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String stripLine = line.replaceAll("<[^>]+>", "");
            System.out.println(stripLine);
        }
    }
}
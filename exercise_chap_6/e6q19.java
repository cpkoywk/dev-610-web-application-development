import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class e6q19 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q19.txt");
            File outputFile = new File("e6q19_output.txt");
            Scanner input = new Scanner(f);
            PrintStream output = new PrintStream(outputFile);
            leetSpeak(input,output);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
   public static void leetSpeak(Scanner inputScanner,PrintStream output) {
     while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String[] words = line.split(" ");
            
            for (String word : words) {
                word = word.replace("o", "0")
                            .replace("l", "1")
                            .replace("e", "3")
                            .replace("a", "4")
                            .replace("t", "7")
                            .replaceAll("s\\b", "Z"); 
                
                output.print("(" + word + ") ");
            }

            output.println(); 
        }
    }
}
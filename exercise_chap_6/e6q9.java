import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q9 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q9.txt");
            Scanner input = new Scanner(f);
            //PrintStream output = new PrintStream(new File("e6q8_output.txt"));
            wordWrap(input);
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
   public static void wordWrap(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
           for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if (i%60!=0){
            System.out.print(letter);}
            else{System.out.println();
            System.out.print(letter);
}
}
        }
    }
    
        }


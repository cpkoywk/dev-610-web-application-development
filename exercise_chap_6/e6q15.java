import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q15 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q15.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            coinFlip(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

   public static void coinFlip(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine().toUpperCase();
            int headCount = 0;
            int tailCount = 0;

            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (currentChar == 'H') {
                    headCount++;
                } else if (currentChar == 'T') {
                    tailCount++;
                }
            }

                double headPercentage = (double) headCount / (headCount+tailCount) * 100;
                System.out.println(headCount + " heads (" + headPercentage + "%)");
                if (headPercentage>50){
                    System.out.println("You win!");}
                System.out.println();

            }
        }
    }




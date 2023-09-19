import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class e6q20 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q20.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            pigLatin(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static void pigLatin(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String[] words = line.split(" ");
            
            for (String word : words) {
                word = word.toLowerCase();
                char firstChar = word.charAt(0);
                if (firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u') {
                    System.out.print(word + "yay ");
                } else {
                    // Word starts with a consonant
                    System.out.print(word.substring(1) + firstChar + "ay ");
                }
            }

            System.out.println(); 
        }
    }

    }
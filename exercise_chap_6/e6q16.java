import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q16 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q16.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);
            mostCommonNames(input);
            //output.flush();
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
  public static void mostCommonNames(Scanner inputScanner) {
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            String[] names = line.split(" ");
    
            String mostCommonName = names[0];
            String firstMaxName = names[0];
            int maxCount = 1;
            int currentCount = 1;

            for (int i = 1; i < names.length; i++) {
                if (names[i].equals(names[i - 1])) {
                    currentCount++;
                } else {
                    if (currentCount > maxCount) {
                        mostCommonName = firstMaxName;
                        maxCount = currentCount;
                    }
                    currentCount = 1;
                    firstMaxName = names[i];
                }
            }
            if (currentCount > maxCount) {
                mostCommonName = firstMaxName;
            }
            System.out.println("Most common: " + mostCommonName);

        }
    }
}


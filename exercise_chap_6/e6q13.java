import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.io.PrintStream;
import java.util.Scanner;

public class e6q13 {
    public static void main(String[] args) {
        try {
            File f = new File("e6q13.txt");
            //File outputFile = new File("e6q11_output.txt");
            Scanner input = new Scanner(f);
            //PrintWriter output = new PrintWriter(outputFile);

            stripComments(input);
            
            //output.flush();
            
            input.close();
            //output.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }

     public static void stripComments(Scanner inputScanner) {
        boolean inMultiLineComment = false;
        
        while (inputScanner.hasNextLine()) {
            String line = inputScanner.nextLine();
            
            if (!inMultiLineComment) {
                line = line.replaceAll("//.*", "");
                
                // Check  multi-line comment
                if (line.contains("/*")) {
                    if (line.indexOf("/*") < line.indexOf("*/")) {
                        line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
                    } else {
                        line = line.substring(0, line.indexOf("/*"));
                        inMultiLineComment = true;
                    }
                }
            } else {
                if (line.contains("*/")) {
                    line = line.substring(line.indexOf("*/") + 2);
                    inMultiLineComment = false;
                } else {
                    line = "";
                }
            }
    
            System.out.println(line);
        }
    }
}
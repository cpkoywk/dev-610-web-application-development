import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e5q2 {
    public static void main(String[] args) {
        try {
            File f = new File("e5q2.txt");
            Scanner input = new Scanner(f);
            evenNumbers(input);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static void evenNumbers(Scanner input) {
        int numberCount = 0;
        int numberSum = 0;
        int evensCount = 0;

        while (input.hasNext()) {
            int number = input.nextInt();
            numberCount++;
            numberSum+=number;
            if (number % 2 == 0) {
                evensCount++;
            }
        }
        
        System.out.println(numberCount + " numbers, sum = " + numberSum );
        System.out.println(evensCount+" evens (" + (evensCount*100/numberCount)+"%)");
    }
}
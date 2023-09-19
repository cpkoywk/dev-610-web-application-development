import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e5q1 {
    public static void main(String[] args) {
        try {
            File f = new File("e5q1.txt");
            Scanner input = new Scanner(f);
            boyGirl(input);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static void boyGirl(Scanner input) {
        int boySum = 0;
        int girlSum = 0;
        int boyCount = 0;
        int girlCount = 0;

        while (input.hasNext()) {
            String name = input.next();
            int score = input.nextInt();

            if (boyCount % 2 == 0) {
                boySum += score;
                boyCount++;
            } else {
                girlSum += score;
                girlCount++;
            }
        }
        int difference = Math.abs(boySum - girlSum);

        System.out.println(boyCount + " boys, " + girlCount + " girls");
        System.out.println("Difference between boys and girls sums: " + difference);
    }
}
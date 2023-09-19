import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e5q4 {
    public static void main(String[] args) {
        try {
            File f = new File("e5q4.txt");
            Scanner input = new Scanner(f);
            System.out.print(countCoins(input));
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static double countCoins(Scanner input) {
        double total = 0.0;

        while (input.hasNext()) {
            int quantity = input.nextInt();
            String coinType = input.next().toLowerCase();
            double value = 0.0;
            switch (coinType) {
                case "pennies":
                case "penny":
                    value = 0.01;
                    break;
                case "nickels":
                case "nickel":
                    value = 0.05;
                    break;
                case "dimes":
                case "dime":
                    value = 0.10;
                    break;
                case "quarters":
                case "quarter":
                    value = 0.25;
                    break;
            }

            total += quantity * value;
        }
        System.out.println("Total money: $" + total);
        return total;
    }
}
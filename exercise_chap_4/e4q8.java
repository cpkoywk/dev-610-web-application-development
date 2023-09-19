import java.util.Scanner;

public class e4q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        smallestLargest(scanner);
    }

    public static void smallestLargest(Scanner scanner) {
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
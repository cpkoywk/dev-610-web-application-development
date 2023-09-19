import java.util.Scanner;

public class e4q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        evenSumMax(scanner);
    }

    public static void evenSumMax(Scanner scanner) {
        System.out.print("How many integers? ");
        int count = scanner.nextInt();
        int evenSum = 0;
        int evenMax = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Next integer? ");
            int number = scanner.nextInt();
            if (number %2==0) {
                evenSum=evenSum +number;
                if (number>=evenMax){evenMax=number;}
            }

        }
        System.out.println("Even sum = " + evenSum+", Even max = " + evenMax);
    }
}
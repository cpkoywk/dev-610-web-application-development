import java.util.Scanner;

public class e5q12 {
    public static void main(String[] args) {
        int totalCount = 0;
        int total = 0;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (n >= 0) {
            System.out.print("Type a number: ");
            n = scanner.nextInt();

            if (n >= 0) {
                totalCount=totalCount+1;
                total += n;
            }
            temp = n;
        }
        scanner.close();
        if (totalCount > 0) {
            double average = (double) total / totalCount;
            System.out.println("Average was " + average);
        } else {
            System.out.println("");
        }
    }
}
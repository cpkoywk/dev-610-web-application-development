import java.util.Scanner;

public class e4q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printGPA(scanner);
    }

   public static void printGPA(Scanner scanner) {
        System.out.print("Enter a student record: ");
        String name = scanner.next();
        int scoreCount = scanner.nextInt();
        double totalScore = 0;

        for (int i = 0; i < scoreCount; i++) {
            int score = scanner.nextInt();
            totalScore= totalScore+score;
        }

        double gpa = totalScore / scoreCount;
        System.out.println(name + "'s grade is " + gpa);
    }
}
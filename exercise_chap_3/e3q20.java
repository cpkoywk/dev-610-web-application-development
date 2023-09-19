import java.util.Scanner;
public class e3q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputBirthday(scanner);
    }

    public static void inputBirthday(Scanner scanner) {
        System.out.print("On what day of the month were you born? ");
        int day = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("What is the name of the month in which you were born? ");
        String month = scanner.nextLine();
        System.out.print("During what year were you born? ");
        int year = scanner.nextInt();
        System.out.print("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
    }
}
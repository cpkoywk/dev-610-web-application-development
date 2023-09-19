import java.util.Scanner;

public class e3q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("What's your last name: ");
        String lastName = scanner.nextLine();
        nameGame(firstName);
        nameGame(lastName);
        scanner.close();
    }
    public static void nameGame(String name) {
        System.out.println("haha " + name +" hehe");
        System.out.println("hehe " + name +" haha");

    }
}
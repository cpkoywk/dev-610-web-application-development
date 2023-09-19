import java.util.Scanner;

public class GangstaNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type your name, playa: ");
        String fullName = scanner.nextLine();
        
        String[] nameParts = fullName.split(" ");
        
        if (nameParts.length >= 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1].toUpperCase();
            char firstInitial = firstName.charAt(0);
            
            String gangstaName = firstInitial + ". Diddy " + lastName + " " + firstName + "-izzle";
            
            System.out.println("Your gangsta name is \"" + gangstaName + "\"");
        } else {
            System.out.println("Please enter a valid full name.");
        }
        scanner.close();
    }
}
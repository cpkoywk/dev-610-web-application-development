import java.util.Scanner;
public class e3q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processName(scanner);
    }

    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String full_name = scanner.nextLine();
        String[] parts = full_name.split(" ");
        System.out.print("Your name in reverse order is " );
        for (int i = parts.length-1; i >=0; i--) {
            if (i==0){
                System.out.print(parts[i]);}
            else {
                System.out.print(parts[i]+  ", ");}}
            }

}
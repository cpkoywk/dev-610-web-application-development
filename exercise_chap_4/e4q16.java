import java.util.Scanner;

public class e4q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPalindrome(scanner);
    }

    public static void printPalindrome(Scanner scanner) {
        System.out.print("Enter word: ");
        String input = scanner.nextLine().toLowerCase(); 

        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome==true) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not palindrome.");
        }
    }
}
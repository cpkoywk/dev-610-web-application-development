//import java.util.Scanner;


public class e4q17 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        stutter("Hello!");
    }

    public static void stutter(String s) {
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            System.out.print(letter);
            System.out.print(letter);
    }
}
}
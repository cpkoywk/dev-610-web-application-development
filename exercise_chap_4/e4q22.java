//import java.util.Scanner;


public class e4q22 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        printAcronym("Breath of the Wild"); 
        printAcronym("Call of Duty 2"); 


    }

    public static void printAcronym(String input) {
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0));
            }
        }
        System.out.println("");

    }
}
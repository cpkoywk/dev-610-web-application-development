//import java.util.Scanner;


public class e4q18 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println(wordCount("hello ")); 
        System.out.println(wordCount("how are you? ")); 
        System.out.println(wordCount(" this string has wide spaces ")); 
        System.out.println(wordCount("")); 
    }

    public static int wordCount(String input) {
        String[] words = input.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
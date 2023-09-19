public class e5q25 {
    public static void main(String[] args) {
        System.out.println(charsSorted("aeIou"));
        System.out.println(charsSorted("aBc"));
        System.out.println(charsSorted("acb"));

    }

    public static boolean charsSorted(String s) {
    boolean result=true;
    s = s.toLowerCase();

    for (int i = 0; i < s.length() - 1; i++) {
        char currentChar = s.charAt(i);
        char nextChar = s.charAt(i + 1);

        if (currentChar > nextChar) {
            result = false; 
        }
    }

    return result;
}}
public class e3q19 {
    public static void main(String[] args) {
        printReverse("hello there!");
    }
    public static void printReverse(String str) {
        for (int i = str.length()-1; i >=0; i--) {
            char x = str.charAt(i);
            System.out.print(x);
            }
        }
    }
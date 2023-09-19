
public class e3q23 {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String str) {
        for (int i = str.length()-1; i >=0; i--) {
            char x = str.charAt(str.length()-1-i);
            System.out.print(x);
            System.out.print(i);

            }
        }
    }

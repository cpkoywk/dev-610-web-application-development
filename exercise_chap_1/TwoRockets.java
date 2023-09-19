//Exercise 1.11
//The redundancy in repeating the same code for the pointy ends of the rockets and square can be eliminated
//However, I still need to do the same thing twice to make them side by side, like I can't apply the method to draw horizontally?
public class TwoRockets {
    public static void main(String[] args) {
        printPointy();
        printSquare();
        printUSA();
        printSquare();
        printPointy();
    }

    public static void printPointy() {
        System.out.println("   /\\   " + "    /\\   ");
        System.out.println("  /  \\  " + "   /  \\  ");
        System.out.println(" /    \\ " + "  /    \\ ");
    }

    public static void printSquare() {
        System.out.println("+------+ " + "+------+ ");
        System.out.println("|      | " + "|      | ");
        System.out.println("|      | " + "|      | ");
        System.out.println("+------+ " + "+------+ ");
    }

    public static void printUSA() {
        System.out.println("|United| " + "|United| ");
        System.out.println("|States| " + "|States| ");
    }
}
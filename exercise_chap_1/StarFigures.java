//Exercise 1.13
public class StarFigures {
    public static void main(String[] args) {
        printDoubleFive();
        printTwoOneTwo();
        System.out.println("");
        printDoubleFive();
        printTwoOneTwo();
        printDoubleFive();
        System.out.println("");
        printSingle();
        printSingle();
        printSingle();
        printDoubleFive();
        printTwoOneTwo();
    }

    public static void printDoubleFive() {
        System.out.println("*****\n*****");
    }

    public static void printTwoOneTwo() {
        System.out.println(" * *\n  *\n * *");
    }

    public static void printSingle() {
        System.out.println("  *");
    }
}
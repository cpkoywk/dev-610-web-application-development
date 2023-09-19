//Exercise 1.17
public class FarewellGoodBye {
    public static void main(String[] args) {
        printVerse1();
        System.out.println("");
        printVerse2();
        System.out.println("");
        printVerse3();
    }
    public static void printFGA() {
        System.out.println("Farewell,");
        System.out.println("goodbye,");
        System.out.println("au revoir,");
    }

    public static void printVerse1() {
        printFGA();
        System.out.println("good night!");
        System.out.println("It's time, to go,");
        System.out.println("and I'll be out of sight!");
    }

    public static void printVerse2() {
        printFGA();
        System.out.println("take care!");
        System.out.println("I'll say, goodbye,");
        System.out.println("that's neither here nor there!");
    }

    public static void printVerse3() {
        printFGA();
        System.out.println("see you later!");
        System.out.println("I hope, you think,");
        System.out.println("I'm a lover, not a hater!");
    }
}

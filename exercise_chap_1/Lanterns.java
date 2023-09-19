//Exercise 1.14
public class Lanterns {
    public static void main(String[] args) {
        printTop();
        System.out.println("");
        printTop();
        printMiddle();
        System.out.println("*************");
        printTop();
        System.out.println("");
        printTop();
        System.out.println("    *****");
        printMiddle();
        printMiddle();
        System.out.println("    *****");
        System.out.println("    *****");


    }

    public static void printTop() {
        System.out.println("    *****\n  *********\n*************");
    }
    public static void printMiddle() {
        System.out.println("* | | | | | *");
    }

    
}


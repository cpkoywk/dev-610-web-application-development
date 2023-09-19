//Exercise 1.15
public class EggStop {
    public static void main(String[] args) {
        printEgg();
        printEggBottom();
        System.out.println("+-------+");
        printEggTop();
        System.out.println("|   STOP  |");
        printEggBottom();
        printEggTop();
        System.out.println("+---------+");
    }
    public static void printEgg() {
        printEggTop();
        printEggBottom();
    }
    public static void printEggTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void printEggBottom() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");

    }
}



public class e2q18 {

    public static void main(String[] args) {
        printBlock();
        printBody(3);
        printBlock();
        printBody(3);
        printBlock();
    }

    public static void printBlock() {
        System.out.println("+===+===+");
        }
    public static void printBody(int n) {
        for (int j = 0; j < n; j++) {
            System.out.println("|   |   |");
        }
    }
}

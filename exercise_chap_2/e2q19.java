public class e2q19 {
    private static final int stacks = 6; //how many stacks this thing has

    public static void main(String[] args) {
        printWindow();
    }

    public static void printWindow() {
        for (int i = 0; i < stacks; i++) {
            printBlock();
            printBody(stacks);
        }
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
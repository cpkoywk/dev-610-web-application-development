public class e2q15 {
    public static void main(String[] args) {
        printDesign();
    }
    public static void printDesign() {
        int n = 5; //number of rows to print
        for (int i = 1; i <= n; i++) {//number of dashes to print
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {// Print digits
                System.out.print(2 * i - 1);
            }
            for (int j = 1; j <= n - i; j++) { //number of dashes to print
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
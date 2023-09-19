public class e2q16 {
    public static void main(String[] args) {
        int n = 6; //number of rows to print
        SlashFigure(n);
    }
    public static void SlashFigure(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("\\");
            }
            for (int k = 0; k < (n - i) * 4; k++) {
                System.out.print("!");
            }
            for (int j = 0; j < i * 2; j++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
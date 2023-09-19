public class e2q17 {
    private static final int N = 8; //global constant???

    public static void main(String[] args) {
        SlashFigure2(N);
    }

    public static void SlashFigure2(int n) {
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
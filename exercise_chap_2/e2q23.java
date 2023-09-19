public class e2q23 {
    private static final int N = 6; //global constant???

    public static void main(String[] args) {
        DollarFigure2(N);
    }

    public static void DollarFigure2(int N) {

        for (int i = N; i >0; i=i-1) {
            for (int k = 0; k < 2*(N-i); k=k+1) {
                System.out.print("*");
        }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("$");
            }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("$");
            }
            for (int k = 0; k < 2*(N-i); k=k+1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
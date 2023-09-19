public class e2q21 {
    private static final int N = 6; //global constant???

    public static void main(String[] args) {
        StarFigure2(N);
    }

    public static void StarFigure2(int N) {
        for (int i = (N-1)*4; i >=0; i=i-4) {
            for (int j = 0; j <i; j=j+1) {
                System.out.print("/");
            }
            for (int k = 0; k < (N-1)*8-2*i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

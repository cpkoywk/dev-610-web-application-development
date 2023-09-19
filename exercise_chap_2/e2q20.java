public class e2q20 {

    public static void main(String[] args) {
        StarFigure();
    }

    public static void StarFigure() {
        for (int i = 16; i >=0; i=i-4) {
            for (int j = 0; j <i; j=j+1) {
                System.out.print("/");
            }
            for (int k = 0; k < 32-2*i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j=j+1) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
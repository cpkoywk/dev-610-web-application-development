public class e2q22 {

    public static void main(String[] args) {
        DollarFigure();
    }

    public static void DollarFigure() {

        for (int i = 7; i >0; i=i-1) {
            for (int k = 0; k < 2*(7-i); k=k+1) {
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
            for (int k = 0; k < 2*(7-i); k=k+1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
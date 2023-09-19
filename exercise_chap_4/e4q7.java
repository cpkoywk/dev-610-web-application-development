public class e4q7
 {
    public static void main(String[] args) {
    xo(2);
    xo(3);
    xo(4);
    xo(5);
    }
    public static void xo(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i == size - 1 - j) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println(); 

        }
        System.out.println(); 
    }
}
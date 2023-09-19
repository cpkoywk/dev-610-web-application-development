public class e3q2 {
    public static void main(String[] args) {
        printPowersOf2(3);
    }
   public static void printPowersOf2(int num) {
        for (int i = 0; i <= num; i++) {
            int powerOf2 = (int) Math.pow(2, i);
            System.out.print(powerOf2 + " ");
        }
    }
}
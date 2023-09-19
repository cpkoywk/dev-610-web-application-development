public class e3q3 {
    public static void main(String[] args) {
        printPowersOfN(4,3);
        printPowersOfN(5,6);
        printPowersOfN(-2,8);
    }
   public static void printPowersOfN(int base,int exp) {
        for (int i = 0; i <= exp; i++) {
            int result = (int) Math.pow(base, i);
            System.out.print(result + " ");
        }
        System.out.println(" ");

    }
}


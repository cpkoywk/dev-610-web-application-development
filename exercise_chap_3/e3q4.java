public class e3q4 {
    public static void main(String[] args) {
        printSquare(3,8);
    }
   public static void printSquare(int min,int max) {
    int range = max - min + 1;
    for (int i = min; i < min + range; i++) {
        for (int j = 0; j < range; j++) {
            int n = (i + j - min) % range + min;
            System.out.print(n);
        }
        System.out.println();
    }
}
}


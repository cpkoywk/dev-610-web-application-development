public class e2q5 {
    public static void main(String[] args) {
        int n = 5; //how many rows to print
        for (int i = 1; i <= n; i++) {
            // print '*' 
            for (int j = 0; j < i; j++) { //how many * to print for each row in each loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

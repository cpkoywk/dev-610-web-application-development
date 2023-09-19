public class e2q7 {
    public static void main(String[] args) {
        int n = 5; //how many rows to print
        int ans = 0;
        for (int i = n; i >0; i--) {
            ans=ans+1;
            for (int j = 0; j < i; j++) { 
                System.out.print(" ");
            }
            System.out.print(ans);
            System.out.println();
        }
    }
}

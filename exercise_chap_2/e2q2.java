public class e2q2 {
    public static void main(String[] args) {
        int ans = 1;
        ForloopSolution(ans);
    }
    public static void ForloopSolution(int ans) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(ans + " "); 
            ans = ans + 2 * i + 1;
        }
    }
}
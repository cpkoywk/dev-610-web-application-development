public class e2q3 {    
    public static void main(String[] args) {
        int n = 12;
        int first = 1;
        int second = 1;
        ForloopSolution(n, first, second);
    }

    public static void ForloopSolution(int n, int first, int second) {
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            // Update the values
            first = second;
            second = next;
        }
    }
}
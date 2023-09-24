public class StarString {

    public static void main(String[] args) {
        starString(0); // Output: *
        starString(1); // Output: **
        starString(2); // Output: ****
        starString(3); // Output: ********
        starString(4); // Output: ****************
        // starString(-1); // This would throw an IllegalArgumentException
    }

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be less than 0.");
        }
        if (n == 0) {
            System.out.print("*");
        } else {
            starString(n - 1); // Recursive call with n-1
            starString(n - 1); // Recursive call with n-1 (twice)
        }
    }
}
import java.util.Random;

public class e5q4 {
    public static void main(String[] args) {
        randomX();
    }
    public static void randomX() {
        Random random = new Random();
        int length = 0;

        while (length < 16) {
            int xNum = random.nextInt(16) + 5;
            for (int i = 0; i < xNum; i++) {
                System.out.print("x");
            }
            System.out.println();
            length += xNum;
        }
        // Print the last line
        for (int i = 0; i < length; i++) {
            System.out.print("x");
        }
    }
}
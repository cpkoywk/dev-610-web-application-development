import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;

public class e5q8 {
    public static void main(String[] args) {
        randomWalk();
    }
    public static void randomWalk() {
        Random random = new Random();
        int position = 0;
        ArrayList<Integer> positions = new ArrayList<>();
        while (Math.abs(position)!=3) {
            int step = random.nextBoolean() ? 1 : -1;
            position = position+step;
            positions.add(position);
            System.out.println("position = " + position);

        }
             // Print the last line
        int maxPosition = 0;

        for (int x : positions) {
            if (x > maxPosition) {
                maxPosition = x;
            }
        }
        System.out.println("max position = " + maxPosition);
            

    }
}
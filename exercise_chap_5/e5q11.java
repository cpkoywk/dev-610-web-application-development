//import java.util.ArrayList;
import java.util.Random;
//import java.util.Scanner;

public class e5q11 {
    public static void main(String[] args) {
        threeHeads();
    }
    public static void threeHeads() {
        Random random = new Random();
        int total = 0;
        while (total<3) {
            int coinflip = random.nextBoolean() ? 1 : -1;
            if (coinflip==1){System.out.print('H');
            total=total+coinflip;}
            else{System.out.print('T');
            total=0;}
            System.out.print(' ');

        }
             // Print the last line
        // 
        System.out.println("");
        System.out.println("Three heads in a row!");
    }
}
import java.util.Random;
import java.util.Scanner;

public class e5q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your desired dice sum: ");
        int num = scanner.nextInt();
        diceSum(num);
        scanner.close();
    }
    public static void diceSum(int num) {
        System.out.println("Desired dice sum: "+num);
        Random random = new Random();
        int n1 = 0;
        int n2 = 0;
    
        while (n1+n2 != num) {
            int x1 = random.nextInt(6)+1;
            int x2 = random.nextInt(6)+1;
            System.out.println(x1 + " and " + x2+" = " +(x1+x2));
            n1 = x1;
            n2=x2;
        }
        //     // Print the last line
        // System.out.println(n1 + "and" + n2+" = " +(n1+n2));
            

    }
}
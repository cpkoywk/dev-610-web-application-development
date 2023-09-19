import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class e5q3 {
    public static void main(String[] args) {
        try {
            File f = new File("e5q3.txt");
            Scanner input = new Scanner(f);
            System.out.print(negativeSum(input));
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
    public static boolean negativeSum(Scanner input) {
        int numberCount = 0;
        int numberSum = 0;
        boolean result = false;

        while (input.hasNext()) {
            int number = input.nextInt();
            numberCount++;
            numberSum+=number;
            if (numberSum < 0) {
                result=true;
                break;
            }
        }
        if (result==true){
        System.out.println("sum of " + numberSum  + " after "+numberCount +" steps" );}
        else{System.out.println("no negative sum");}
    return result;
    }
}
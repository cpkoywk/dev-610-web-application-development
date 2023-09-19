import java.util.Random;
public class e5q6 {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random random = new Random();
        int n = 0;
        int lineCount=0;
    
        while (n < 48) {
            int x = random.nextInt(51);
            System.out.println(x);
            n = x;
            lineCount=lineCount+1;
        }
            // Print the last line
        System.out.print("total guesses = " + lineCount);
            
        }
    }
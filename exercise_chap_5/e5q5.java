import java.util.Random;

public class e5q5 {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        Random random = new Random();
        int numLines = random.nextInt(6) + 5; //
        for (int i = 0; i < numLines; i++) {
            int lineLength = random.nextInt(81);//most 80 characters 

            for (int j = 0; j < lineLength; j++) {
                char randomChar = (char) (random.nextInt(26) + 'a'); //type a random character
                System.out.print(randomChar);
            }
            System.out.println(); 
        }
    }
}
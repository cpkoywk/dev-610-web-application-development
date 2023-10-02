    import java.util.Random;


public class e13q20 {


    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            // Choose a random index j where j >= i
            int j = i + rand.nextInt(arr.length - i);

            // Swap elements at indexes i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


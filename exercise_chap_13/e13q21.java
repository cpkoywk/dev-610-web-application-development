import java.util.Random;

public class e13q21 {

    // Shuffle function from the previous answer
    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = i + rand.nextInt(arr.length - i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    // BogoSort algorithm
    public static void bogoSort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1, 5};
        bogoSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
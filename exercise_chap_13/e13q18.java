public class e13q18 {
    public static void selectionSortModified(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the largest element with the last element
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        selectionSortModified(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

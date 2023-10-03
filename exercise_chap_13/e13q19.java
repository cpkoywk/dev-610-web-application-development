public class e13q19 {
    public static void dualSelectionSort(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start < end) {
            int minIndex = start;
            int maxIndex = start;
    
            for (int i = start; i <= end; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
    
            int temp = arr[start];
            arr[start] = arr[minIndex];
            arr[minIndex] = temp;
    

            if (maxIndex == start) {
                maxIndex = minIndex;
            }
    
            temp = arr[end];
            arr[end] = arr[maxIndex];
            arr[maxIndex] = temp;
    
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        dualSelectionSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

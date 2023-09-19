public class e7q1 {
    public static void main(String[] args) {
        int[] array = {74, 85, 102, 99, 101, 85, 56};
        int valueToFind = 85;
        System.out.println(lastIndexOf(array,valueToFind));

}
    public static int lastIndexOf(int[] arr, int value) {
        int lastIndex = -1;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                lastIndex = i;  
            }
        }
        return lastIndex;  
    }
}

public class e7q3 {
    public static void main(String[] args) {
        int[] array = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(array,4,17));

}
    public static int countInRange(int[] arr,int min, int max) {
        int output=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <=max && arr[i] >=min){output=output+1;}
    }
            return output;

}
}
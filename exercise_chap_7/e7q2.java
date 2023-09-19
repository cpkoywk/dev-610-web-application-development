public class e7q2 {
    public static void main(String[] args) {
        int[] array = {36, 12, 25, 19, 46, 31, 22};
        System.out.println(range(array));

}
    public static int range(int[] arr) {
    int minimum = Integer.MAX_VALUE;
    int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= maximum){maximum=arr[i];}
            else if(arr[i] <=minimum){minimum=arr[i];}
            }
        int rangee=maximum-minimum+1;
        return rangee;

    }
}

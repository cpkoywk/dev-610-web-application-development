public class e7q4 {
    public static void main(String[] args) {
        double[] list1 =  {16.1, 12.3,22.2, 14.4};
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        System.out.println(isSorted(list1));
        System.out.println(isSorted(list2));
}
    public static boolean isSorted(double[] arr) {
        boolean output=true;
        double minimum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minimum){minimum=arr[i];}
            else{output=false;}
    }
            return output;

}
}
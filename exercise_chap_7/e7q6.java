public class e7q6 {
    public static void main(String[] args) {
        int[] arr = {1, -2,4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }

    public static double stdev(int[] arr) {
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total=total+arr[i];
        }
        double average=(double) total/arr.length;
        System.out.println(average);
        double notresult=0;
        for (int i = 0; i < arr.length; i++) {
            notresult=notresult+(Math.pow((arr[i]-average),2)/(arr.length-1));
        }
        System.out.println(notresult);

        double result=Math.sqrt(notresult);
        return result;
    }
}


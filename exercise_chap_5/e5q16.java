public class e5q16 {
    public static void main(String[] args) {
        System.out.println(anglePairs(120,60,30));     
        System.out.println(anglePairs(30,50,70));     
}

    public static boolean anglePairs(int a, int b, int c) {

        return (a + b == 90 || a + b == 180 || a + c == 90 || a + c == 180 || b + c == 90 || b + c == 180);
    }
}
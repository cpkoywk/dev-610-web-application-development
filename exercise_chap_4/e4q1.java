public class e4q1 {
    public static void main(String[] args) {
        System.out.println(fractionSum(1));
        System.out.println(fractionSum(2));
        System.out.println(fractionSum(3));
        System.out.println(fractionSum(4));
    }
    public static double fractionSum(int n) {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result=result+(1.0/i);

}
        return result;
    }
}
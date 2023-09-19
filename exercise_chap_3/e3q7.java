public class e3q7 {
    public static void main(String[] args) {
        largerAbsVal(4,-6,-11
        );
    }
    public static void largerAbsVal(int a, int b, int c) {
        if (Math.abs(a) >= Math.abs(b) && Math.abs(a) >= Math.abs(c)) {
            System.out.println(Math.abs(a));}
        else if (Math.abs(b) >= Math.abs(a) && Math.abs(b) >= Math.abs(c)) {
            System.out.println(Math.abs(b));
        } else {
            System.out.println(Math.abs(c));
    }
}
}
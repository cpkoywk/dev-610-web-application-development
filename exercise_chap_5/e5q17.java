public class e5q17 {
    public static void main(String[] args) {
        System.out.println(monthApart(4, 15, 5, 22));     
        System.out.println(monthApart(9, 19, 10, 17)); 
        System.out.println(monthApart(9, 19, 11, 17));     
    
}

    public static boolean monthApart(int m1, int d1, int m2, int d2) {

        return ((m2-m1==1 && d2-d1>=0)||(m2-m1>1));
    }
}
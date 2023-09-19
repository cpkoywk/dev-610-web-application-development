public class e5q18 {
    public static void main(String[] args) {
        System.out.println(digitSum(-456));     
        System.out.println(digitSum(0)); 
    
}

    public static int digitSum(int n) {
    n = Math.abs(n);
     int sum = 0;
     while (n > 0) {
         int digit = n % 10;
         sum = sum+digit;

         n = n/10;
     }
     return sum;    
    }
}
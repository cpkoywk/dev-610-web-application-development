public class e5q23 {
    public static void main(String[] args) {
        System.out.println(hasAnOddDigit(4822116));
        System.out.println(hasAnOddDigit(2448));}



public static boolean hasAnOddDigit(int n) {
    boolean result=false;
    while (n > 0) {
         int digit = n % 10;
         if (digit%2!=0){result=true;}
         n = n/10;
     }
     return result;
}}

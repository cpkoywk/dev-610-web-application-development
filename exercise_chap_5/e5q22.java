public class e5q22 {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(135319));
        System.out.println(allDigitsOdd(9145293));}



public static boolean allDigitsOdd(int n) {
    boolean result=true;
    while (n > 0) {
         int digit = n % 10;
         if (digit%2==0){result=false;}
         n = n/10;
     }
     return result;
}}

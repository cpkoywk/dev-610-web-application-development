public class e5q20 {
    public static void main(String[] args) {
        System.out.println(digitRange(68437));     
        System.out.println(digitRange(0)); 
        System.out.println(digitRange(3572));     
        System.out.println(digitRange(-947));     
        System.out.println(digitRange(1));     


}

    public static int digitRange(int n) {
    n = Math.abs(n);
     int minimum= n % 10;
     int maximum=0;
     while (n > 0) {
         int digit = n % 10;
         if (digit<=minimum){minimum=digit;}
         if (digit>=maximum){maximum=digit;}
         n = n/10;
     }
     return maximum-minimum+1;    
    }
}
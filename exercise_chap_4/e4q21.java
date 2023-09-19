//import java.util.Scanner;
public class e4q21 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
     perfectNumbers(500); 
     perfectNumbers(28); 



    }

    public static Boolean isPerfectNumber(int a) {
        int total=0;
        for (int i = 1; i < a; i++) {
            if(a%i==0){total=total+i;}
    }
        if (a==total){
            return true;}
        else{return false;}}

    public static void perfectNumbers(int n) {
        System.out.print("Perfect numbers up to "+n+": "); 
        for (int i = 1; i <= n; i++) {
            if (isPerfectNumber(i)){
            System.out.print(i+" "); 
            }
}
            System.out.println(""); 

}
}
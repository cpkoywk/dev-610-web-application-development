//import java.util.Scanner;


public class e4q20 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println(numUnique(1,2,3)); 
        System.out.println(numUnique(1,2,1)); 
        System.out.println(numUnique(1,1,1)); 

    }

    public static int numUnique(int a, int b,int c) {
        int cnt = 0;
        if(a==b && b==c){cnt=1;}
        else if((a!=b && b!=c && a!=c)){cnt=3;}
        else {cnt=2;}
        return cnt;
    }
}
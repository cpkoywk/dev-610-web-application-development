//import java.util.Scanner;

public class e4q12 {
    public static void main(String[] args) {
        printTriangleType(1,1,1);
        printTriangleType(2,2,3);
        printTriangleType(2,3,4);
        printTriangleType(1,2,4);

    }

   public static void printTriangleType(int a,int b,int c) {
    if(a+b<c||a+c<b||b+c<a){
        throw new IllegalArgumentException("IllegalArgumentException");
    }   
    else if (a==b && b==c){
            System.out.println("equilateral");
            }else if(a!=b && a!=c &&b!=c){
            System.out.println("scalene");
            }else {System.out.println("isosceles");
}

            }
        }


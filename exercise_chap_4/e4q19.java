//import java.util.Scanner;


public class e4q19 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println( quadrant(1.2,3)); 
        System.out.println(quadrant(-1.2,3)); 
        System.out.println(quadrant(-1.2,-3)); 
        System.out.println(quadrant(1.2,-3)); 
        System.out.println(quadrant(0,-3)); 
    }

    public static int quadrant(double a, double b) {
        int quad = 0;
        if(a>0 && b>0){quad=1;}
        else if(a>0 && b<0){quad=4;}
        else if(a<0 && b<0){quad=3;}
        else if(a<0 && b>0){quad=2;}
        else {quad=0;}
        return quad;
    }
}
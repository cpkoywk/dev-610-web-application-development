//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;

public class e5q10 {
    public static void main(String[] args) {
        hopscotch(-1);

        hopscotch(0);
        hopscotch(1);
        hopscotch(3);

    }
    public static void hopscotch(int hop) {

        int n1=4;
        int n2=2;
        int n3=3;
    if (hop>=0){
        System.out.println("   1");
        for (int i = 0; i <= hop-1; i++) {
                System.out.println(n2+"     "+n3);
                System.out.println("   "+n1);
                n2=n2+3;
                n3=n3+3;
                n1=n1+3;
    }}else{        System.out.println("");
}
}
}
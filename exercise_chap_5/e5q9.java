//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;

public class e5q9 {
    public static void main(String[] args) {
        printFactors(48);
    }
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Error");
            return;
        }
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                if (i != number) {
                    System.out.print(" and ");
                }
            }
        }
        System.out.println();
    }
    }
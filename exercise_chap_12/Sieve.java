//e11q1
/*Modify the Sieve program developed in Section 11.1 to make two optimizations. First, instead of storing all integers
up to the maximum in the numbers list, store only 2 and all odd numbers from 3 upward. Second, write code
to ensure that if the first number in the numbers list ever reaches the square root of the maximum, all remaining
values from the numbers list are moved into the primes list. (Why is this a valid operation?)
*/
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class Sieve {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        List<Integer> primes = Sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);
        console.close();

    }

    // Returns a list of all prime numbers up to given max
    // using the sieve of Eratosthenes algorithm.
    public static List<Integer> Sieve(int max) {
        List<Integer> primes = new LinkedList<>();

        // add all numbers from 2 to max to a list
        // store only 2 and all odd numbers from 3 upward.
        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        for (int i = 2; i <= max; i++) {
            if (i>2 && i%2!=0){numbers.add(i);}
        }
        System.out.println("Initial List of Numbers " + numbers );

        while (!numbers.isEmpty()) {
            // remove a prime number from the front of the list
            int front = numbers.remove(0);
            primes.add(front);

            if (front * front > max) {
                primes.addAll(numbers);
                break; 
            }
    

            // remove all multiples of this prime number
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
            }

        }

        return primes;

    }}}
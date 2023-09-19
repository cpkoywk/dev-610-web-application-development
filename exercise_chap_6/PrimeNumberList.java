import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {

    public static void main(String[] args) {
        int n = 50; // Input value
        List<Integer> primeList = generatePrimeList(n);
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < primeList.size(); i++) {
            System.out.print(primeList.get(i));
            if (i < primeList.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    // Method to generate a list of prime numbers up to a given limit
    public static List<Integer> generatePrimeList(int limit) {
        List<Integer> primes = new ArrayList<>();
        if (limit >= 2) {
            primes.add(2);
        }
        for (int number = 3; number <= limit; number += 2) {
            boolean isPrime = true;
            for (int divisor : primes) {
                if (divisor * divisor > number) {
                    break;
                }
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(number);
            }
        }
        return primes;
    }
}
public class e5q21 {
    public static void main(String[] args) {
        System.out.println(swapDigitPairs(482596));
        System.out.println(swapDigitPairs(-482596));

        System.out.println(swapDigitPairs(1234567));}

public static int swapDigitPairs(int num) {
    // Handle negative numbers by making them positive temporarily
    boolean isNegative = false;
    if (num < 0) {
        num = -num;
        isNegative = true;
    }

    // Init
    int result = 0;
    int position = 1;

    // Swap pairs 
    while (num >= 10) {
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;

        // Swap the two digits and add them to the result
        result += (secondLastDigit * position) + (lastDigit * (position * 10));

        // Move to the next pair of digits
        num = num/ 100;
        position = position*100;
    }

    // If there's a single digit left, add it to the result as is
    if (num > 0) {
        result = result+num * position;
    }

    // restore the negative sign
    if (isNegative==true) {
        result = -result;
    }
    return result;
}}

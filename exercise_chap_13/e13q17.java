import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class e13q17 {

static class StringNumericComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        Scanner scanner1 = new Scanner(s1);
        Scanner scanner2 = new Scanner(s2);

        int num1 = scanner1.nextInt();
        int num2 = scanner2.nextInt();

        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        String[] strings = {
            "9847 New York, NY",
            "276453 Helena, MT",
            "123456 Seattle, WA",
            "1000000 San Francisco, CA",
            "2 Los Angeles, CA"
        };

        Arrays.sort(strings, new StringNumericComparator());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}}
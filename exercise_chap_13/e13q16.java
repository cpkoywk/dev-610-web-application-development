import java.util.Arrays;
import java.util.Comparator;

public class e13q16 {

static class StringWordCountComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int wordCount1 = s1.split("\\s+").length;
        int wordCount2 = s2.split("\\s+").length;

        return Integer.compare(wordCount1, wordCount2);
    }

    public static void main(String[] args) {
        String[] strings = {
            "hello",
            "I see",
            "You can do it",
            "Java is fun",
            "Comparator is powerful"
        };

        Arrays.sort(strings, new StringWordCountComparator());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}}
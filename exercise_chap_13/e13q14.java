import java.io.*;
import java.util.*;

public class e13q14 {
    
    public static void main(String[] args) throws IOException {
        List<String> words = readWordsFromFile("dictionary.txt");
        Collections.sort(words);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type two words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        
        int index1 = binarySearch(words, word1);
        int index2 = binarySearch(words, word2);
        
        if (index1 == -1 || index2 == -1) {
            System.out.println("word not found in dictionary");
            return;
        }

        int count = Math.abs(index2 - index1) - 1;
        System.out.println("There are " + count + " words between " + word1 + " and " + word2 + ".");
    }

    public static List<String> readWordsFromFile(String filename) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        }
        return words;
    }

    public static int binarySearch(List<String> words, String target) {
        int low = 0;
        int high = words.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = words.get(mid).compareTo(target);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

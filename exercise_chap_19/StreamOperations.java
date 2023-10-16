import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.nio.file.Path;

public class StreamOperations {

        public static void main(String[] args) {

        System.out.println("e19q1");

        printDoubled(new int[]{2, -1, 4, 16});
        System.out.println();
        System.out.println("e19q2");

        System.out.println(sumAbsVals(new int[]{-1, 2, -4, 6, -9}));
        System.out.println("e19q3");

        System.out.println(largestEven(new int[]{5, -1, 12, 10, 2, 8}));
        System.out.println("e19q4");

        System.out.println(totalCircleArea(new double[]{3.0, 1.0, 7.2, 5.5}));
        System.out.println("e19q5");

        System.out.println(countNegatives(new int[]{5, -1, -3, 20, 47, -10, -8, -4, 0, -6, -6}));
        System.out.println("e19q6");

        System.out.println(pigLatin("go seattle mariners"));
        System.out.println("e19q7");

        System.out.println(countVowels("SOO beautiful"));
        System.out.println("e19q8");

        System.out.println(toSortedForm("tennessee"));
        System.out.println("e19q9");

        System.out.println(stdev(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}));
        System.out.println("e19q10");

        List<String> content = Arrays.asList(
            "The quick brown fox",
            "jumps",
            "over",
            "The lazy dog",
            "apple",
            "grid",
            "zone",
            "exit",
            "door",
            "life",
            "echo",
            "aero",
            "jazz",
            "",
            "Empty lines above and below",
            ""
        );
           Path tempFile = null;
    try {
        tempFile = Files.createTempFile("test", ".txt");
        
        Files.write(tempFile, content);

        // Test for glueReverse
        List<String> words = Arrays.asList("the", "quick", "brown", "fox");
        System.out.println(StreamOperations.glueReverse(words));  
        System.out.println("e19q11");

        // Test for theLines
        System.out.println(StreamOperations.theLines(tempFile.toString())); 
        System.out.println("e19q12");

        // Test for fourLetterWords
        System.out.println(StreamOperations.fourLetterWords(tempFile.toString()));  
        System.out.println("e19q13");

        // Test for firstFive
        StreamOperations.firstFive(tempFile.toString()); 
    
        // Remember to delete temp file
        Files.deleteIfExists(tempFile);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
       


 

    public static void firstFive(String filename) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            lines.filter(line -> !line.trim().isEmpty())
                 .limit(5)
                 .forEach(System.out::println);
        }
    }
    public static long fourLetterWords(String filename) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            return lines.filter(line -> line.length() == 4).distinct().count();
        }
    }

    public static long theLines(String filename) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(filename))) {
            return lines.filter(line -> line.toLowerCase().startsWith("the")).count();
        }
    }

    public static String glueReverse(List<String> words) {
        return words.stream()
                    .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                        java.util.Collections.reverse(list);
                        return list.stream().collect(Collectors.joining());
                    }));
    }

       public static double stdev(double[] arr) {
        Double mean = Arrays.stream(arr).boxed().collect(Collectors.averagingDouble(Double::doubleValue));
        double variance = Arrays.stream(arr).boxed()
                                .collect(Collectors.summingDouble(val -> (val - mean) * (val - mean))) / arr.length;
        return Math.sqrt(variance);
    }
    public static String toSortedForm(String str) {
        return str.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }
     public static long countVowels(String str) {
        return str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    }
  public static String pigLatin(String str) {
        return Arrays.stream(str.split(" "))
            .map(word -> word.substring(1) + word.charAt(0) + "-ay")
            .collect(Collectors.joining(" "));
    }
        public static long countNegatives(int[] arr) {
        return Arrays.stream(arr).filter(e -> e < 0).count();
    }
    public static double totalCircleArea(double[] radii) {
        return Math.round(Arrays.stream(radii).map(r -> Math.PI * r * r).sum());
    }

    public static int largestEven(int[] arr) {
        return Arrays.stream(arr).filter(e -> e % 2 == 0).max().getAsInt();
    }
    public static int sumAbsVals(int[] arr) {
        return Arrays.stream(arr).map(Math::abs).sum();
    }
    public static void printDoubled(int[] arr) {
        Arrays.stream(arr).map(e -> e * 2).forEach(e -> System.out.print(e + " "));
    } 
    }

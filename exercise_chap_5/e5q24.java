public class e5q24 {
    public static void main(String[] args) {
        System.out.println(isAllVowels("aeIou"));
        System.out.println(isAllVowels("aBc"));
    }

    public static boolean isAllVowels(String s) {
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (!(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U')) {
                result = false;
            }
        }
        return result;
    }
}
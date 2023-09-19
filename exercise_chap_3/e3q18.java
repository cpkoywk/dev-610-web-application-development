public class e3q18 {
    public static void main(String[] args) {
        vertical("hey now");
    }
    public static void vertical(String str) {
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x != ' ') {
                System.out.println(x);
            }
        }
    }
}
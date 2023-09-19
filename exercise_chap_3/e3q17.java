public class e3q17 {
    public static void main(String[] args) {
        padString("sss",6);
    }
    public static void padString(String str, int len) {
        if (str.length() >= len) {
            System.out.println(str) ; 
        } else {
            System.out.print(str); 
            for (int i = 0; i < len - str.length(); i++) {
                System.out.print(' '); }
            System.out.println();
            }

    }
}   
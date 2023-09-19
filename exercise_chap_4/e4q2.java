public class e4q2 {
    public static void main(String[] args) {
        System.out.println(repl( "hello", 3));
        System.out.println(repl( "hello", 0));

    }
    public static String repl(String s,int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result=result+s;
    }
            return result;

}
}
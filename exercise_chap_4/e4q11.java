import java.util.Scanner;

public class e4q11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        longestName(console,4);
    }

   public static void longestName(Scanner console,int n) {
        int resultLen=0;
        String resultName="";
        for (int i = 1; i <= n; i++) {
            System.out.print("name #");
            System.out.print(i+"? ");
            String name = console.nextLine();
            if (name.length()>=resultLen){
                resultName=name;
                resultLen = name.length();}
        }

        System.out.println(resultName+"'s name is longest");
    }
}
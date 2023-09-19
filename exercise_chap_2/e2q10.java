public class e2q10 {
    public static void main(String[] args) {
        int lineLength = 60;
    for(int i = 0; i < lineLength/10; i++)
        System.out.print("         |");
    System.out.println();
    for(int j = 0; j < 2; j++) {
        for(int i = 1; i <= lineLength/2; i++) {
            System.out.print(i%10);
        }
    }
}}

public class e2q9 {
    public static void main(String[] args) {
        int lineLength = 40;
    for(int i = 0; i < lineLength; i++)
        System.out.print("-");
    System.out.println();
    for(int i = 0; i < lineLength/4; i++)
        System.out.print("_-^-");   
    System.out.println();

    for(int j = 0; j < 2; j++) {
        for(int i = 1; i <= lineLength/4; i++) {
            System.out.print(i%10);
            System.out.print(i%10);
        }
    }
    System.out.println();
    for(int i = 0; i < lineLength; i++)
        System.out.print("-");
}
}
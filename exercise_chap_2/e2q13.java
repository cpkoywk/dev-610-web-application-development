public class e2q13 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //total lines in the output
            for (int j = 9; j >=0; j--) { //which number to start in the each line
                for (int k = 0; k < 5; k++) { //how many times each number in each line got repeated
                    System.out.print(j);
                }
            }
            System.out.println(); 
        }
    }
}
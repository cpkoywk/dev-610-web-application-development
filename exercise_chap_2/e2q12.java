public class e2q12 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { //total lines in the output
            for (int j = 0; j <= 9; j++) {//which number to start in the each line
                for (int k = 0; k < 3; k++) {//how many times each number in each line got repeated
                    System.out.print(j);
                }
            }
            System.out.println(); 
        }
    }
}
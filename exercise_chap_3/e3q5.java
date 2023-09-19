public class e3q5 {
    public static void main(String[] args) {
        printGrid(4,6);
    }
    public static void printGrid(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = (i + j * rows);
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}


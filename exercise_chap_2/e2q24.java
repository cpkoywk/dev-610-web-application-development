public class e2q24 {
    private static final int WIDTH = 10; //global constant???
    private static final int HEIGHT = 5; //global constant???

    public static void main(String[] args) {
        drawRectangles();
    }

    public static void drawRectangles() {
        // first rectangle
        for (int i = 0; i < HEIGHT; i++) { //how many rows it's going to print
            for (int j = 0; j < WIDTH; j++) { //how many * in each row
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // second rectangle 
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < WIDTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
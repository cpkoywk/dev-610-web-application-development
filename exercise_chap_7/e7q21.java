

public class e7q21 {
    public static void main(String[] args) {

        System.out.println("e7q21:");
        int[][] square = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println(isMagicSquare(square));


    }

        public static boolean isMagicSquare(int[][] matrix) {
            int summation = 0;
            int temp = 0;
        
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            // Calculate the expected summation for rows
            for (int i = 0; i < rows; i++) {
                summation += matrix[0][i];
            }
        
            // Check rows
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    temp += matrix[i][j];
                }
                if (temp != summation) {
                    return false; 
                }
                temp = 0; 
            }
            // Check columns
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i < rows; i++) {
                    temp += matrix[i][j];
                }
                if (temp != summation) {
                    return false; 
                }
                temp = 0; 
            }
            // Check diagonals
            int diagonal1 = 0;
            int diagonal2 = 0;
            for (int i = 0; i < rows; i++) {
                diagonal1 += matrix[i][i];
                diagonal2 += matrix[i][cols - i - 1];
            }
            return diagonal1 == summation && diagonal2 == summation;
        }

    }



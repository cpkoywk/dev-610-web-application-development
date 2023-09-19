import java.awt.*;

public class e7q26 {
    public static void main(String[] args) {
        try {
            DrawingPanel panel = new DrawingPanel("e7q22.jpg");

            blur(panel);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void blur(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        int numRows = pixels.length;
        int numCols = pixels[0].length;
    
        Color[][] blurredPixels = new Color[numRows][numCols];
    
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int redSum = 0;
                int greenSum = 0;
                int blueSum = 0;
                int count = 0;
    
                for (int r = row - 1; r <= row + 1; r++) {
                    for (int c = col - 1; c <= col + 1; c++) {
                        if (r >= 0 && r < numRows && c >= 0 && c < numCols) {
                            redSum += pixels[r][c].getRed();
                            greenSum += pixels[r][c].getGreen();
                            blueSum += pixels[r][c].getBlue();
                            count++;
                        }
                    }
                }
    
                int averageRed = redSum / count;
                int averageGreen = greenSum / count;
                int averageBlue = blueSum / count;
    
                blurredPixels[row][col] = new Color(averageRed, averageGreen, averageBlue);
            }
        }
    
        panel.setPixels(blurredPixels);
    }

 
}
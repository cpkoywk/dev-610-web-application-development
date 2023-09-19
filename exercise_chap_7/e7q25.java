import java.awt.*;

public class e7q25 {
    public static void main(String[] args) {

            DrawingPanel panel = new DrawingPanel("e7q22.jpg");

            // Rotate the image counter-clockwise by 90 degrees (left)
            rotateLeft(panel);

            // Rotate the image clockwise by 90 degrees (right)
            DrawingPanel panel2 = new DrawingPanel("e7q22.jpg");
            rotateRight(panel2);

    }

    public static void rotateLeft(DrawingPanel panel) {
        int originalWidth = panel.getWidth();
        int originalHeight = panel.getHeight();

        DrawingPanel rotatedPanel = new DrawingPanel(originalHeight, originalWidth);
        Color[][] originalImage = panel.getPixels();
        Color[][] rotatedImage = rotatedPanel.getPixels();

        for (int x = 0; x < originalWidth; x++) {
            for (int y = 0; y < originalHeight; y++) {
                rotatedImage[y][originalHeight - x - 1] = originalImage[x][y];
            }
        }
        rotatedPanel.setPixels(rotatedImage);
    }

    public static void rotateRight(DrawingPanel panel) {
        int originalWidth = panel.getWidth();
        int originalHeight = panel.getHeight();

        DrawingPanel rotatedPanel = new DrawingPanel(originalHeight, originalWidth);
        Color[][] originalImage = panel.getPixels();
        Color[][] rotatedImage = rotatedPanel.getPixels();

        for (int x = 0; x < originalWidth; x++) {
            for (int y = 0; y < originalHeight; y++) {
                rotatedImage[originalHeight - y - 1][x] = originalImage[x][y];
            }
        }
        rotatedPanel.setPixels(rotatedImage);
    }
}
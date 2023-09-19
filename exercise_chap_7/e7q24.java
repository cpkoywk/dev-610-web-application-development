import java.awt.*;

public class e7q24 {
    public static void main(String[] args) {
        try {
            DrawingPanel panel = new DrawingPanel("e7q22.jpg");
            zoomIn(panel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void zoomIn(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        int originalWidth = panel.getWidth();
        int originalHeight = panel.getHeight();
        int newWidth = originalWidth * 2;
        int newHeight = originalHeight * 2;

        DrawingPanel zoomedPanel = new DrawingPanel(newWidth, newHeight);
        Graphics g = zoomedPanel.getGraphics();

        Color[][] originalImage = panel.getPixels();

        for (int x = 0; x < originalWidth; x++) {
            for (int y = 0; y < originalHeight; y++) {
                Color pixelColor = originalImage[y][x];

                // Copy the pixel color into a 2x2 cluster
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        int newX = x * 2 + i;
                        int newY = y * 2 + j;
                        g.setColor(pixelColor);
                        g.fillRect(newX, newY, 1, 1);
                    }
                }
            }
        }
        panel.setPixels(pixels);

    }
}
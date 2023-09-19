import java.awt.*;

public class mirror {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel("e7q22.jpg"); 
        mirror(panel);
    }

    // Flips the pixels of the given drawing panel horizontally.
    public static void mirror(DrawingPanel panel) {

        Color[][] pixels = panel.getPixels();
        //pixels.length is how many rows are there in a picture
        for (int row = 0; row < pixels.length; row++) {
            //pixels[0] is how many columns are there
            for (int col = 0; col < pixels[0].length / 2; col++) {
                // swap with pixel at "mirrored" location, for first col, the pixel goes to pixels[0].length - 1 - 1
                int opposite = pixels[0].length - 1 - col;
                Color px = pixels[row][col];
                pixels[row][col] = pixels[row][opposite];
                pixels[row][opposite] = px;
            }
        }
        panel.setPixels(pixels);
    }
}
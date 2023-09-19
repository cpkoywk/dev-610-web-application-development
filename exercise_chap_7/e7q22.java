import java.awt.*;
public class e7q22 {
    public static void main(String[] args) {
        try {
            DrawingPanel panel = new DrawingPanel("e7q22.jpg"); 
            
            grayscale(panel);
            
            //panel.save("e7q22_grayscale.jpg"); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void grayscale(DrawingPanel panel) {
    Color[][] pixels = panel.getPixels();
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                int avg=(pixels[row][col].getRed()+pixels[row][col].getGreen()+pixels[row][col].getBlue())/3;

                Color grayscaleColor = new Color(avg, avg, avg);
                pixels[row][col] = grayscaleColor;
            }
        }
       panel.setPixels(pixels);
    }



// import java.awt.*;

// public class mirror {
//     public static void main(String[] args) {
//         DrawingPanel panel = new DrawingPanel(300, 200);
//         Graphics g = panel.getGraphics();
//         g.drawString("Hello, world!", 20, 50);
//         g.fillOval(10, 100, 20, 70);
//         mirror(panel);


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

// Produces the negative of the given image by inverting all color
// values in the panel.
public static void negative(DrawingPanel panel) {
Color[][] pixels = panel.getPixels();
for (int row = 0; row < pixels.length; row++) {
    for (int col = 0; col < pixels[0].length; col++) {
// extract red/green/blue components from 0-255
int r = 255 - pixels[row][col].getRed();
int g = 255 - pixels[row][col].getGreen();
int b = 255 - pixels[row][col].getBlue();
// update the pixel array with the new color value
pixels[row][col] = new Color(r, g, b);
}
}
panel.setPixels(pixels);
}
}

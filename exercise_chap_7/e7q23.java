import java.awt.*;
public class e7q23 {
    public static void main(String[] args) {
        try {
            DrawingPanel panel = new DrawingPanel("e7q22.jpg"); 
            
            transpose(panel);
            
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
    

    public static void transpose(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();

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
        for (int row = 0; row < pixels.length / 2; row++) {
                int opposite = pixels.length - 1 - row;
                for (int col = 0; col < pixels.length; col++) {
                    Color px = pixels[row][col];
                    pixels[row][col] = pixels[opposite][col];
                    pixels[opposite][col] = px;
                }
            }
        
            panel.setPixels(pixels);
        }

    }
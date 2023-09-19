public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException();
        }

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Point p, int width, int height) {
        this.x = (int) Math.round(p.getX());
        this.y = (int) Math.round(p.getY());
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }

    public boolean contains(int x, int y) {
        return x >= this.x && x <= (this.x + width) && y >= this.y && y <= (this.y + height);
    }

    public boolean contains(Point p) {
        return contains((int) Math.round(p.getX()), (int) Math.round(p.getY()));
    }

    public Rectangle union(Rectangle rect) {
        int newX = Math.min(this.x, rect.getX());
        int newY = Math.min(this.y, rect.getY());
        int newWidth = Math.max(this.x + this.width, rect.getX() + rect.getWidth()) - newX;
        int newHeight = Math.max(this.y + this.height, rect.getY() + rect.getHeight()) - newY;

        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    public Rectangle intersection(Rectangle rect) {
        int newX = Math.max(this.x, rect.getX());
        int newY = Math.max(this.y, rect.getY());
        int newWidth = Math.max(0, Math.min(this.x + this.width, rect.getX() + rect.getWidth()) - newX);
        int newHeight = Math.max(0, Math.min(this.y + this.height, rect.getY() + rect.getHeight()) - newY);

        return new Rectangle(newX, newY, newWidth, newHeight);
    }

    public boolean contains(Rectangle rect) {
        // Check if all four corners of 'rect' are contained within this rectangle
        boolean topLeft = contains(rect.getX(), rect.getY());
        boolean topRight = contains(rect.getX() + rect.getWidth(), rect.getY());
        boolean bottomLeft = contains(rect.getX(), rect.getY() + rect.getHeight());
        boolean bottomRight = contains(rect.getX() + rect.getWidth(), rect.getY() + rect.getHeight());

        return topLeft && topRight && bottomLeft && bottomRight;
    }


    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rect = new Rectangle(1, 2, 3, 4);

        // Print information about the Rectangle
        System.out.println("e8q18");

        System.out.println(rect.toString());
        System.out.println("e8q19");
  
        Rectangle rect2 = new Rectangle(new Point(2.5, 3.5), 4, 5);
        System.out.println("Rectangle 2: " + rect2.toString());

        System.out.println("e8q20");

        System.out.println("Contains (2, 3): " + rect.contains(2, 3));
        System.out.println("Contains Point(2, 3): " + rect.contains(new Point(2, 3)));
        System.out.println("Contains (5, 6): " + rect.contains(5, 6));
        System.out.println("e8q21");

        Rectangle unionRect = rect.union(rect2);
        System.out.println("Union : " + unionRect.toString());

        System.out.println("e8q22");

        Rectangle intersectionRect = rect.intersection(rect2);
        System.out.println("Intersection : " + intersectionRect.toString());
        System.out.println("e8q23");
        System.out.println("Rect contains Rect2: " + rect.contains(rect2));


    }
}
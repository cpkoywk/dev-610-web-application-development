public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }


    public String toString() {
        return "["+p1.toString() + ", " + p2.toString()+"]" ;
        
    }
    public boolean isCollinear(Point p) {
        double slope1 = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
        double slope2 = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
        return slope1 == slope2;
    }
    public static void main(String[] args) {
        System.out.println("e8q15:");
        // Point pp1 = new Point(22, 3);
        // Point pp2 = new Point(4, 7);
        Line lin = new Line(1,2, 3,4);
        System.out.println(lin.toString());
        System.out.println("e8q16:");
        // Check if a Point is collinear with the Line
        Point p = new Point(5, 6);
        boolean collinear = lin.isCollinear(p);
        System.out.println("Is Point " + p.toString() + " collinear with the Line? " + collinear);
    }


    }
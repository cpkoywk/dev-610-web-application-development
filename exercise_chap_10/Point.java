//e10q19
public class Point implements Comparable<Point> {
    private  double x;
    private  double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "("+x + "," + y+")";
    }
    public Double getX() {
        return x;
    }

        public Double getY() {
        return y;
    }
    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    public void flip() {
        double temp = x;
        x = -y;
        y = -temp;
    
    }
    public int manhattanDistance(Point other) {
        double deltaX = Math.abs(this.x - other.x);
        double deltaY = Math.abs(this.y - other.y);
        int distance=(int)(deltaX + deltaY);
        return distance;
    }

    public boolean isVertical(Point other){
        boolean result = false;
        if (this.x==other.x){result=true;}
        return result;
    }
    @Override
    public int compareTo(Point other) {
        int yComparison = Double.compare(this.y, other.y);
        
        if (yComparison == 0) {
            return Double.compare(this.x, other.x);
        }

        return yComparison; 
    }
      public double slope(Point other) {
        if (this.x == other.x) {
            throw new IllegalArgumentException("wrong");
        }else{
        double slope = (this.y-other.y)/(this.x - other.x);
        return slope;}
    }
    
    public boolean isCollinear(Point p1, Point p2) {
        double slope1 = slope(p1);
        double slope2 = slope(p2);

        //round it
        slope1 = Math.round(slope1 * 10000.0) / 10000.0;
        slope2 = Math.round(slope2 * 10000.0) / 10000.0;

        return slope1 == slope2;
    }


    public static void main(String[] args) {
        Point point1 = new Point(2, 3);   
        Point point2= new Point(6,6);
        Point point3= new Point(1,3);

        int result1 = point1.compareTo(point2);
        System.out.println("point1.compareTo(point2): " + result1);

        int result2 = point2.compareTo(point3);
        System.out.println("point2.compareTo(point3): " + result2);

        int result3 = point1.compareTo(point3);
        System.out.println("point1.compareTo(point3): " + result3);
    }




    }
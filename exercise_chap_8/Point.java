public class Point {
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
        Point point1 = new Point(2.0, 3.0);   
        System.out.println("e8q1:");

        System.out.println(point1.getQuadrant());
        System.out.println("e8q2:");

        Point pt = new Point(5, -3);
        System.out.println("pt's coordinate:"+pt.x+" , "+pt.y);
        pt.flip();
        System.out.println("pt's coordinate after flip:"+pt.x+" , "+pt.y);
        System.out.println("e8q3:");

        Point point2= new Point(6,6);
        Point point3= new Point(2,-122);
        Point point4= new Point(5,-2);


        System.out.println(point2.manhattanDistance(point1));
        System.out.println("e8q4:");
        System.out.println(point1.isVertical(point2));
        System.out.println(point1.isVertical(point3));
        System.out.println("e8q5:");
        System.out.println(point1.slope(point2));
        System.out.println("e8q6:");
        System.out.println(point1.isCollinear(point2,point4));



    }
} 
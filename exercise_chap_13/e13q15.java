import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

public class e13q15 {

    public static void main(String[] args) {
        Point[] points = {
            new Point(1, 2),
            new Point(3, 4),
            new Point(0, 0),
            new Point(2, 2)
        };

        Arrays.sort(points, new PointComparator());

        for (Point p : points) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
    
    static class PointComparator implements Comparator<Point> {
        @Override
        public int compare(Point p1, Point p2) {
            double distance1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
            double distance2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);

            return Double.compare(distance1, distance2);
        }
    }
}
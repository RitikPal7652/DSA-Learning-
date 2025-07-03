package DSA.PriorityQueue;
import java.util.*;

public class kClosestPointFromOrigin {
    public static class Point{
        /*
        This class is made so that we have access of x and y.
         */
        int x;
        int y;
        int distance;
    }
    public static class pointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if(p1.distance>p2.distance) return 1;
            else if(p2.distance>p1.distance)    return -1;
            else return 0;
        }
    }
//    public static void main(String[] args) {
//        PriorityQueue<Point> pq=new PriorityQueue<>(new pointComparator()) {
//
//        }
//    }
}

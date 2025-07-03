package DSA.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class stream_Of_Numbers {
    public static class Point{
        int distance;
    }
    public static class PointComparator implements Comparator<Point>{
        public int compare(Point p1,Point p2){
            if(p1.distance>p2.distance) return 1;
            else if(p2.distance>p1.distance)    return -1;
            else return 0;
        }
    }
    public static void add(PriorityQueue<Integer> left,PriorityQueue<Integer> right,int element){
        //At starting.
        if(left.isEmpty()) {
            left.add(element);
            return;
        }
        if(element<left.peek()){  //Agar left me jaana hai.
            if(left.size()==right.size()){
                left.add(element);
            }else{
                //Means left size is greater than right size.
                right.add(left.remove());
                left.add(element);
            }
        }
        else{   //Agar right me jaana hai to jao naa mene kha roka aapko
            //Means if element>right.peek()
            if(left.size()==right.size()){
                left.add(right.remove());
                right.add(element);
            }else{
                //Means left size is greater than right size priority queue.
                right.add(element);
            }
        }
    }
    public static double find_Median(PriorityQueue<Integer> left, PriorityQueue<Integer> right){
        if(left.isEmpty())  return -1;
        else if(left.size()-right.size()==1)    return left.peek();
        else    return (double)(left.peek()+right.peek())/2;
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());//Max PriorityQueue(Take Minimum Integers)
        PriorityQueue<Integer> right = new PriorityQueue<>();//Min PriorityQueue(Take Maximum Integers)

        add(left,right,15);
        System.out.println(find_Median(left,right));
        add(left,right,10);
        System.out.println(find_Median(left,right));
        add(left,right,5);
        add(left,right,20);
        System.out.println(find_Median(left,right));
        add(left,right,25);
        System.out.println(find_Median(left,right));
    }
}

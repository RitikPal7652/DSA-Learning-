package DSA.Greedy_Algorithm;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
public class Minimum_Intervals_Removed_for_non_overlapping {
    public static class Interval{
        int start;
        int end;
        //Constructor
        public Interval(int s,int e){
            this.start=s;
            this.end=e;
        }

        @Override
        public String toString(){
            return start+"-->"+end;
        }
    }
    public static class IntervalSort implements Comparator<Interval>{
        public int compare(Interval i1,Interval i2){
            if(i1.start>i2.start)   return 1;
            else if(i1.start<i2.start)  return -1;
            else    return 0;
        }
    }
    public static void main(String[] args) {
        List<Interval> pair=new ArrayList<>();
        pair.add(new Interval(1,2));
        pair.add(new Interval(2,3));
        pair.add(new Interval(3,4));
        pair.add(new Interval(1,3));
        pair.add(new Interval(2,4));
        pair.add(new Interval(1,4));

        /*
        Sorting because we have to move from left to right.

        Right vala hamesha delete krdo agar bda hai to bcoz it may cover next
        part of out interval.
         */
        pair.sort(new IntervalSort());
        System.out.println(pair);

       // [1-->2, 1-->3, 2-->3, 2-->4, 3-->4]
        int result=0;
        Interval prevPair=pair.get(0);
        for(int i=1;i<pair.size();i++){
            Interval currPair=pair.get(i);

            if(currPair.start<prevPair.end){
                //Means current pair is overlapped on previous one.
                result++;
            }
            else{
                prevPair=currPair;
            }
        }
        System.out.println("Minimum interval removed so that overlapping doesn't happen: "+result);
    }
}

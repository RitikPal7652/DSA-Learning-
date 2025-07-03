package DSA.Hashset.HashSet;

import java.util.HashSet;
import java.util.*; //All classes will be imported.

public class LongestConsecutiveElementSequence {
    static int maxLength(int[] arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int max_length = 0;
        for(Integer i : arr)    set.add(i); //To make  the set.
        for(Integer i : set){
            if(!set.contains(i-1)){ //means, it is a starting element.
                int currNum = i;
                int currStreak = 1; //length of given subsequence.

                while(set.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                max_length = Math.max(max_length, currStreak);
            }
        }
        return max_length;
    }
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(maxLength(arr));
    }
}

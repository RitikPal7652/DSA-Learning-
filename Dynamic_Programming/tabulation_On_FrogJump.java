package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class tabulation_On_FrogJump {
    public static void main(String[] args) {
//        List<Integer> heights= List.of(10,20,10);
//        int n=heights.size();
//        int k=1;
//
//        int[] dp=new int[n];
//
//        //Assigning firstly 0th index and then other indexes.
//        dp[0]=0;

        //Now other indexes after the 0th index.

//        for(int i=1;i<n;i++){
//            int minCost=10000;//random value assign to minCost
//            for(int j=1;j<=k;j++){
//                if(i-j >= 0){
//                    int jump=Math.abs(heights.get(i)-heights.get(i-j))+dp[i-j];
//                    minCost=Math.min(minCost,jump);
//                }
//            }
//            dp[i]=minCost;
//        }
//        System.out.println(dp[n-1]);


        //Optimization on space complexity
        List<Integer> heights= List.of(10,30,40,50,20);
        int n=heights.size();
        int k=3;

        List<Integer> dp=new ArrayList<>();

        //Assigning firstly 0th index and then other indexes.
        dp.add(0);
        for(int i=1;i<n;i++){
            int minCost=10000;//random value assign to minCost
            for(int j=1;j<=k;j++){
                if(i-j >= 0){
                    int jump=Math.abs(heights.get(i)-heights.get(i-j)) + dp.get(dp.size()-j);
                    minCost=Math.min(minCost,jump);
                }
            }
            if(dp.size()==k){
                dp.remove(0);
            }
            dp.add(minCost);
        }
        //dp is of size k
        System.out.println(dp.get(k-1));
    }
}

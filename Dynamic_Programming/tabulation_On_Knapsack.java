package DSA.Dynamic_Programming;

import java.util.List;

public class tabulation_On_Knapsack {
    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3);
        List<Integer> weight=List.of(4,5,1);
        int Wt=4;
        int n=profit.size();
        int[][] dp=new int[n+1][Wt+1];
//        //First of all assign base level means 0th index.
//        for(int i=0;i<Wt;i++){
//            if(weight.get(0)<=i){
//                dp[0][i]=profit.get(0);
//            }else {
//                dp[0][i]=0;
//            }
//        }
//        //Now assign all other values rather than 0th index.
//        for(int idx=1;idx<n;idx++){
//            for(int W=0;W<=Wt;W++){
//                int pick=0;
//                if(W>=weight.get(idx)){
//                    pick=profit.get(idx)+dp[idx-1][W-weight.get(idx)];
//                }
//                int notPick=dp[idx-1][W];
//
//                dp[idx][W]=Math.max(pick,notPick);
//            }
//        }
//        System.out.println(dp[n-1][Wt]);

        /*
        Now we can also improve by space bcoz we have to only need prev and
        curr value so there is no need to store any value.
            So we take an array curr and prev and do changes in that so that
            we can save our maximum space.
         */
        int[] curr=new int[Wt+1];
        int[] prev=new int[Wt+1];

        for(int i=0;i<=Wt;i++){
            curr[i]=0;
            if(weight.get(0)<i){
                prev[i]=profit.get(0);
            }else{
                prev[i]=0;
            }
        }
        for(int idx=1;idx<n;idx++){
            for(int w=0;w<=Wt;w++){
                int pick=0;
                if(w>=weight.get(idx)){
                    pick=profit.get(idx)+prev[w-weight.get(idx)];
                }
                int notPick=prev[w];

                curr[w]=Math.max(pick,notPick);
            }
            System.arraycopy(curr,0,prev,0,Wt+1);
        }
        System.out.println(prev[Wt]);
    }
}

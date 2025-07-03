package DSA.Dynamic_Programming;
import java.util.List;
public class memoization_On_Knapsack {
    static int calls=0;
        public static int knapsack(List<Integer> profit,List<Integer> weight,int idx,int W,int[][] dp){
            if(dp[idx][W]!=-1){
                return dp[idx][W];
            }
            //Base case
            if(idx==0){
            if(weight.get(0)<=W){
                return profit.get(0);
            }
            else return 0;
            }

            int pick=0;
            if(W>=weight.get(idx))
                pick=profit.get(idx)+knapsack(profit,weight,idx-1,W-weight.get(idx),dp);

            //In case of not pick value of weight will not change.
            int notPick=knapsack(profit,weight,idx-1,W,dp);

            //Bcoz we have to find maximum in the profit we can earn.
            return dp[idx][W] = Math.max(pick,notPick);
    }

    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3);
        List<Integer> weight=List.of(4,5,1);
        int W=4;
        int n=profit.size();

        int[][] dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack(profit,weight,n-1,W,dp));
    }
}



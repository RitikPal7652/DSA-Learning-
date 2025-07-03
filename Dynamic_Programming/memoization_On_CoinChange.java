package DSA.Dynamic_Programming;
import java.util.List;

public class memoization_On_CoinChange {
    static int calls=0;
    public static int coins(List<Integer> coins, int sum, int idx,int[][] dp) {
          //Memoization condition
        if(dp[idx][sum]!=-1) {
            return dp[idx][sum];
        }
            calls++;
        //Base case
        if(idx==0){
            if(sum%coins.get(idx)==0){  //If sum is multiple of coin present at index 0.
                return 1;
            }else {
                return 0;
            }
        }
        int pick=0;
        if(sum>=coins.get(idx))
            pick=coins(coins,sum-coins.get(idx),idx,dp);

        int notPick=coins(coins,sum,idx-1,dp);

            return dp[idx][sum]=pick+notPick;
    }

    public static void main(String[] args) {
        List<Integer> coins= List.of(1,2,3);
        int n=coins.size();
        int sum=4;

        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j] = -1;
            }
        }
        int ans=coins(coins,sum,2,dp);
        System.out.println(ans);
        System.out.println(calls);

    }


}

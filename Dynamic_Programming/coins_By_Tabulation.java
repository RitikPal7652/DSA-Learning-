package DSA.Dynamic_Programming;
import java.util.List;
public class coins_By_Tabulation {
    static int calls=0;
    public static int coins(List<Integer> coin,int sum,int idx,int[][] dp){
        if(dp[idx][sum]!=-1) {
            return dp[idx][sum];
        }
            calls++;
        //Base case
        if(idx==0){
            if(sum%coin.get(idx)==0){  //If sum is multiple of coin present at index 0.
                return 1;
            }else {
                return 0;
            }
        }
        int pick=0;
        if(sum>=coin.get(idx))
            pick=coins(coin,sum-coin.get(idx),idx,dp);
            /*
            We have an infinite supply  of each and every coin that's why we
            keep on traversing each coin again and again and find the all
            possible answer.
             */
        int notPick=coins(coin,sum,idx-1,dp);

            return dp[idx][sum]=pick+notPick;
    }
    public static void main(String[] args) {
        /*
        Tabulation is applying by replacing just memoization to tabulation
        means recursion is replaced by loop condition.
         */
        int totalSum=4;
       List<Integer> coins=List.of(1,2,3);
        int n=coins.size();

       // int[][] dp=new int[n+1][totalSum+1];

        int[] curr=new int[totalSum+1];
        int[] prev=new int[totalSum+1];
        //For 0th index only.
       for(int i=0;i<=totalSum;i++){
           if(i%coins.get(0)==0){
               prev[i]=1;
           }
           else{
               prev[i]=0;
           }
       }

       //for ahead of 0th index
        for(int idx=1;idx<n;idx++){
            for(int sum=0;sum<=totalSum;sum++){
                int pick=0;
                if(sum>=coins.get(idx)){
                    pick=curr[sum-coins.get(idx)];
                }
                int notPick=prev[sum];

                curr[sum]=pick+notPick;
            }
            prev=curr;
        }
        System.out.println(prev[totalSum]);
    }
}

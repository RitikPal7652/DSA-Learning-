package DSA.Dynamic_Programming;

import java.util.List;

public class memoization_On_FrogJump {
    public static int frogJump(List<Integer> stone, int i, int k,int[] dp){
        if(i==0) {
            return 0;
        }

        //Memoization conditon
        if(dp[i]!=-1)   return dp[i];

        //For k jumps
        int minCost=10000;  //random value assigned to minCost.
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                int jump=Math.abs(stone.get(i)-stone.get(i-j))+frogJump(stone,i-j,k,dp);
                minCost=Math.min(minCost,jump);
            }
        }
        return dp[i]=minCost;
    }

    public static void main(String[] args) {
        //List<Integer> heights= List.of(10,30,40,50,20);
        List<Integer> heights= List.of(10,20,10);
        int n=heights.size();
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++)    dp[i]=-1;

        int k=1;
        int ans=frogJump(heights,n-1,k,dp);
        System.out.println(ans);
    }
}

package DSA.Dynamic_Programming;

public class catalanNumber_Tabulation {
    public static void main(String[] args) {
        int n=6;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int j=2;j<=n-1;j++){
            //build up answer
            for(int i=0;i<j;i++){
                //this is formula for C0 * Cn-1.....
                dp[j] += dp[i]*dp[j-i-1];
            }
        }
        System.out.println(dp[n-1]);
    }
}

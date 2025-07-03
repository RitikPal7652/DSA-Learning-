package DSA.Dynamic_Programming;

public class MCM_Tabulation {
    static int count=0;
    public static void main(String[] args) {
        int[] arr={40,20,30,10,30};
        int n=arr.length;
        int[][] dp=new int[n][n];

        /*
        As we go from 1 to n-1 in recursion so in tabulation we go from n-1 to 1 and
        our j will shrink continously and at one point it will reach at base condition.

        So here we use two loop one is for recursive approach and second is for that
        because our j loop will shrink continuely, rest will remain same ans,minimum
        and cost
         */
        //First of all base case
        for(int i=0;i<n;i++){
            dp[i][i]=0; //We can write here dp[i][j]=0 or dp[i][i]=0 bcoz i==j is there.
        }

        for(int i=n-1;i>=1;i--){    //from n-1 -> 1
            for(int j=i+1;j<=n-1;j++){  //firstly in memoization j move from n-1->1 now 1->n-1
                /*
                The value of j will always be greater than or equal to i,but in case of
                equal to i our base condition will hit and dp[i][i] will become 0.
                It will not happen that j will go less than i bcoz in every iteration
                the maximum allowed of j shrink is equal to greater than i.
                 */
                int min=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int ans=dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    //finding minimum from all of them
                    min=Math.min(ans,min);
                }
                dp[i][j]=min;
            }
        }
        System.out.println(dp[1][n-1]);

        /*
        We can't do that previous and current in this case because k will vary according
        the size of i & j, so that method can't be apply here to optimize the space.
         */
    }
}

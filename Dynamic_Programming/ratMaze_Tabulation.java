package DSA.Dynamic_Programming;

public class ratMaze_Tabulation {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int[][] dp=new int[m][n];
        //Base case for tabulation
        for(int i=0;i<m;i++)    dp[i][0]=1;
        for(int j=0;j<n;j++)    dp[0][j]=1;

        /*
        In recursion, we move from last to first but now in tabulation we move from first
        to last and
                    In base case we filled first column with 1 and 1 row with also 1 so
                    that it will be easy to find that there is one possible answer for
                    that.
         */
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}

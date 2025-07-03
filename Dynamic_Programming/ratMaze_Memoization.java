package DSA.Dynamic_Programming;

public class ratMaze_Memoization {
    public static int ratMaze(int i,int j,int[][] dp){
        //Base case1
        if(i==0 && j==0)    return 1;
        //Base case2
        if(i<0 || j<0)  return 0;
        //Memoization base condition
        if(dp[i][j]!=-1)    return dp[i][j];

        return dp[i][j]=ratMaze(i-1,j,dp)+ratMaze(i,j-1,dp);
    }
    public static void main(String[] args) {
        int m=2;
        int n=3;
        //Memoization
        int[][] dp=new int[m][n];
        //Place -1 at each index of dp array
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(ratMaze(m-1,n-1,dp));
    }
}

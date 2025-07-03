package DSA.Dynamic_Programming;

public class MCM_Memoization {
    static int count=0;
    public static int mcmMemoization(int[] arr,int i,int j,int[][] dp){
        if(dp[i][j]!=-1)    return dp[i][j];
        //Base case
        //Because we can't find arr[k] at that time.
        if(i==j)    return 0;
        count++;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int ans=mcmMemoization(arr,i,k,dp)+mcmMemoization(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);
            //finding minimum from ans and minimum
            min=Math.min(ans,min);
        }
        return dp[i][j]=min;
    }
    public static void main(String[] args) {
        int[] arr={40,20,30,10,30};
        int n=arr.length;
        int[][] dp=new int[n][n];
        //Place -1 at each index of array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(mcmMemoization(arr,1,n-1,dp));
        System.out.println(count);
    }
}

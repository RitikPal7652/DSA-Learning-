package DSA.Dynamic_Programming;

public class longest_Common_Subsequence {
    //Simple Recursion

//    public static int lCS(String s1,String s2,int i,int j){
//        //Base Case
//        if(i<0 || j<0)    return 0;
//
//        if(s1.charAt(i)==s2.charAt(j)){
//            return 1+lCS(s1,s2,i-1,j-1);
//        }
//            return Math.max(lCS(s1,s2,i-1,j),lCS(s1,s2,i,j-1));
//    }

    //Memoization
//    public static int memoization_LCS(String s1,String s2,int i,int j,int[][] dp){
//        if(i<0 || j<0)  return 0;
//
//        if(dp[i][j]!=-1)    return dp[i][j];
//        if(s1.charAt(i)==s2.charAt(j)){
//            return dp[i][j]=1+memoization_LCS(s1,s2,i-1,j-1,dp);
//        }
//        return dp[i][j]=Math.max(memoization_LCS(s1,s2,i-1,j,dp),memoization_LCS(s1,s2,i,j-1,dp));
//    }

        //Tabulation
    public static void main(String[] args) {

//        int[][] dp=new int[m+1][n+1];
//
//            //Base Case of Tabulation.
//            for(int i=0;i<=n;i++)
//                dp[0][i]=0;
//            for(int j=0;j<=m;j++)
//                dp[j][0]=0;
//
//            for(int i=1;i<=m;i++){
//                for(int j=1;j<=n;j++){
//                    if(s1.charAt(i-1)==s2.charAt(j-1)){
//                        //Match
//                        dp[i][j]=1+dp[i-1][j-1];
//                    }
//                    else{
//                        //Not Match
//                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
//                    }
//                }
//            }
            /*
            1. We have shifted the index to right by one. At 0th index 0 is present.
            2. This is the reason we wrote here i-1 or j-1 so that we cant go outside the index or go out of
            bounds.
             */
//        System.out.println("Length of Longest Subsequence is: "+lcs(s1,s2,n-1,m-1));
//        System.out.println("Length of Longest Subsequence is: "+memoization_LCS(s1,s2,n-1,m-1,dp));
        String s1="AGGTAB";
        String s2="GXTXAYB";

        int m=s1.length();
        int n=s2.length();

        /*
        We have to need only previous two elements so why we use whole 2d dp array.
        This is the reason that we use current and previous array.
         */
        int[] curr=new int[n+1];
        int[] prev=new int[n+1];

        for(int i=0;i<=n;i++)
            prev[i]=0;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    //match
                    curr[j]=1+prev[j-1];
                }
                else {
                    //not match
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
                prev=curr;
            }
        }
        System.out.println("Length of Longest Subsequence is: "+prev[n]);
    }
}
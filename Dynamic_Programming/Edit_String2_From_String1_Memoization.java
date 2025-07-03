package DSA.Dynamic_Programming;

public class Edit_String2_From_String1_Memoization {
    public static int makeString2(String s1,String s2,int i,int j,int[][] dp){
        //Memoization
        if(dp[i][j]!=-1)    return dp[i][j];
        //Base Case.
        if(i==0)   return dp[i][j]=j;
        if(j==0)   return dp[i][j]=i;

        //If both the characters of strings are equal then go before.
        if(s1.charAt(i-1)==s2.charAt(j-1))
           return dp[i][j]= makeString2(s1,s2,i-1,j-1,dp);

        /*
         1 is adding in all the operations bcoz in every operation there is cost of
         1 which is common for all the operations.
         */
        int replace=1+makeString2(s1,s2,i-1,j-1,dp);
        int insertion=1+makeString2(s1,s2,i,j-1,dp);
        int deletion=1+makeString2(s1,s2,i-1,j,dp);

        //At last we have to return minimum value of cost so we find minimum.
        return dp[i][j]=Math.min(replace,Math.min(insertion,deletion));
    }
    public static void main(String[] args) {
        String s1="SUNDAY";
        String s2="SATURDAY";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        //METHOD CALL.
        System.out.println("Minimum Operation that we need to apply is: "+makeString2(s1,s2,m,n,dp));
    }
}

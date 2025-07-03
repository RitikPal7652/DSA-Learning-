package DSA.Dynamic_Programming;

public class Edit_str1_ToForm_str2_Tabulation {
    public static void main(String[] args) {
        String s1="cat";
        String s2="cut";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];

        //Base case
        //Jb jb j=0 tb tk dp[i][j] ki value i rhegii.
        for(int i=0;i<=m;i++)   dp[i][0]=i;
        //Jb jb i=0 rhegi tb tk dp[i][j] ki valur j rhegii.
        for(int j=0;j<=n;j++)   dp[0][j]=j;

        //Now start from 1st index.
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                    continue;
                }
                //Else make another option
                int replace=1+dp[i-1][j-1];
                int insertion=1+dp[i][j-1];
                int deletion=1+dp[i-1][j];
                dp[i][j]=Math.min(replace,Math.min(insertion,deletion));
            }
        }
        System.out.println(dp[m][n]);
    }
}

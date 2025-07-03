package DSA.Dynamic_Programming;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class RegexMatching_Memoization {
    public static boolean rec(String s,String p,int i,int j,boolean[][] dp){
        //Base case.
        if(i==-1 && j==-1)  return dp[i][j]=true;
        if(i>=0 && j==-1)   return dp[i][j]=false;
        if(i==-1 && j>=0){
            boolean flag=true;
            //Check that if all the characters are * if yes then true else false.
            for(int x=0;x<j;x++){
                if(p.charAt(x)!='*')    flag=false;
            }
            return dp[i][j]=flag;
        }

        //Memoization.
        if(dp[i][j]!=false)    return dp[i][j];

        // Self Work
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
            return rec(s,p,i-1,j-1,dp);
        }else if(p.charAt(j)=='*'){
            //either take or leave/Ignore
            return (dp[i][j-1] || dp[i-1][j]);
//                    Ignore        Take
        }else{
            return dp[i][j]=false;
        }
    }
    public static void main(String[] args) {
        String s = "abbbac";
        String p = ".*a*";
        int n = s.length();
        int m = p.length();
        //Memoization
        boolean[][] dp = new boolean[n][m];
        //Place -1 at each index of array.
//        for(int i=0;i<=n;i++) {
//            for(int j=0;j<=m;j++) {
//                dp[i][j]=-1;
//            }
//        }
        // Arrays.fill(dp, -1);

        System.out.println(rec(s,p,n-1,m-1,dp));
    }
}

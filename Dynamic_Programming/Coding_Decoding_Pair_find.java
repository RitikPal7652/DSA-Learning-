package DSA.Dynamic_Programming;

import javax.swing.*;

public class Coding_Decoding_Pair_find {
    static int calls=0;
    public static void main(String[] args) {
        String s="11126";
        int[] dp=new int[s.length()];
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
        int ans=no_Of_Ways(s,s.length()-1,dp);
        System.out.println(ans);
        System.out.println(calls);
    }

    private static int no_Of_Ways(String s, int idx,int[] dp) {
        calls++;
        /*
        It is basically Fibonacci series bcoz at the end we do sun
         ((N-1)+(N-2)).

         Condition bas ye hai kii ye 0 pe nhi chlega and 26 se upar valo ke
         liye nhi chlega.
         */
        //Base Case.
        if(idx==0 || idx==-1)  return 1;

        //Dynamic Programming.
        if(dp[idx]!=-1) {
            return dp[idx];
        }
        //Recursive Work.
        int non_combine=0;
        //Bcoz idx-1 is running only if idx is not equal to 0.

        if(s.charAt(idx)!='0')
            non_combine=no_Of_Ways(s,idx-1,dp);

        int combine=0;
        /*
        For idx-2 is running only if last two index is less than 26 bcoz
        alphabet is only upto z, not greater than z
         */
        if(s.charAt(idx-1)=='1' || s.charAt(idx-1)=='2' && s.charAt(idx)<='6'){
            combine=no_Of_Ways(s,idx-2,dp);
        }
        return dp[idx]=non_combine+ combine;
    }
}

package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MCTCAS_memoization {
    public static int MCTCAS(List<Integer> cuts,int i,int j,int[][] dp){
        //Minimum cost to cut a stick.
        if(dp[i][j]!=-1)    return dp[i][j];
        //Base case
        if(i>j) return 0;

        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            //cut at kth part of arraylist.
            //basically the difference between two cost1 and cost2 is the length of before the cutting part of that length.
            //First recursion      Second recursion        cost1            cost2
            int ans=MCTCAS(cuts,i,k-1,dp) + MCTCAS(cuts,k+1,j,dp) + cuts.get(j+1) - cuts.get(i-1);

            min=Math.min(ans,min);
        }
        return dp[i][j]=min;
    }
    public static void main(String[] args) {
        List<Integer> cut= List.of(1,3,4,5);
        int c=cut.size();
        int n=7;

        List<Integer> cuts=new ArrayList<>();
        cuts.add(0);
        cuts.addAll(cut);   //To add cut arraylist in cuts arraylist
        cuts.add(n);
        Collections.sort(cuts);
        int[][] dp=new int[c+2][c+2];
        for(int i=0;i<=c;i++){
            for(int j=0;j<=c;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(MCTCAS(cuts,1,c,dp));
    }
}

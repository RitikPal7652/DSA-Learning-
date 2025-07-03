package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MCTCAS_Tabulation {
    public static void main(String[] args) {
//        List<Integer> cut= List.of(1,3,4,5);
        List<Integer> cut= List.of(5,6,1,4,2);
        int c=cut.size();
//        int n=7;
        int n=9;
        List<Integer> cuts=new ArrayList<>();
        cuts.add(0);
        cuts.addAll(cut);   //To add cut arraylist in cuts arraylist
        cuts.add(n);
        Collections.sort(cuts);
        int[][] dp=new int[c+2][c+2];

        for(int i=0;i<=c;i++){
            for(int j=0;j<=i;j++){
                dp[i][j]=0;
            }
        }
        //Recursion will move from 1 to c now in tabulation we will move from c->1.
        //Also j shriks form last to till 1 but now j will move from 1->c.
        for(int i=c;i>=1;i--){
            for(int j=i;j<=c;j++){//j will start form i bcoz j is always greater than i.
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    //cut at kth part of arraylist.
                    //basically the difference between two cost1 and cost2 is the length of before the cutting part of that length.
                    //First recursion      Second recursion        cost1            cost2
                    int ans=dp[i][k-1] + dp[k+1][j] + cuts.get(j+1) - cuts.get(i-1);

                    min=Math.min(ans,min);
                }
               dp[i][j]=min;
            }
        }
        System.out.println(dp[1][c]);
    }
}

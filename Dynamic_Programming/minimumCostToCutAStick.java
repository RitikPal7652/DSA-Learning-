package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minimumCostToCutAStick {
    public static int MCTCAS(List<Integer> cuts,int i,int j){
        //Minimum cost to cut a stick.
        //Base case
        if(i>j) return 0;

        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            //cut at kth part of arraylist.
            //basically the difference between two cost1 and cost2 is the length of before the cutting part of that length.
                     //First recursion      Second recursion        cost1            cost2
            int ans=MCTCAS(cuts,i,k-1) + MCTCAS(cuts,k+1,j) +
                    cuts.get(j+1) - cuts.get(i-1);
            /*
            I will mark 0 at its first place and at last place n will be placed so that it
            is easy for me to track the solution when i found the solution in mid of the
            array cut.
             */

            min=Math.min(ans,min);
        }
        return min;
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
        System.out.println(MCTCAS(cuts,1,c));
    }
}

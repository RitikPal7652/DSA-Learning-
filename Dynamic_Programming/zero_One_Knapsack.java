package DSA.Dynamic_Programming;

import java.util.List;

public class zero_One_Knapsack {
    static int calls=0;
    public static int knapsack(List<Integer> profit,List<Integer> weight,int idx,int W){
        calls++;
        //Base case
        if(idx==0){
            if(weight.get(0)<=W){
                return profit.get(0);
            }
            else return 0;
        }

        int pick=0;
        if(W>=weight.get(idx))
            pick=profit.get(idx)+knapsack(profit,weight,idx-1,W-weight.get(idx));

        //In case of not pick value of weight will not change.
        int notPick=knapsack(profit,weight,idx-1,W);

        //Bcoz we have to find maximum in the profit we can earn.
        return Math.max(pick,notPick);
    }
    public static void main(String[] args) {
        List<Integer> profit= List.of(1,2,3);
        List<Integer> weight=List.of(4,5,1);
        int W=4;
        int n=profit.size();
        System.out.println(knapsack(profit,weight,n-1,W));
    }
}

package DSA.Dynamic_Programming;

import java.util.List;

public class N_Stones_Frog_Jump {
    public static int frogJump(List<Integer> stone,int i,int k){
       if(i==0) {
           return 0;
       }

       //For k jumps
        int minCost=10000;  //random value assigned to minCost.
        for(int j=1;j<=k;j++){
            if(i-j>=0){
                int jump=Math.abs(stone.get(i)-stone.get(i-j))+frogJump(stone,i-j,k);
                minCost=Math.min(minCost,jump);
            }
        }
        return minCost;
    }
    public static void main(String[] args) {
      //List<Integer> heights= List.of(10,30,40,50,20);
        List<Integer> heights= List.of(10,20,10);
        int n=heights.size();
        int k=1;
        int ans=frogJump(heights,n-1,k);
        System.out.println(ans);
    }
}


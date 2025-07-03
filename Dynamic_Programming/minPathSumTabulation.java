package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;

public class minPathSumTabulation {
    public static void main(String[] args) {
        List<List<Integer>> grid=new ArrayList<>();
        grid.add(List.of(1,3,1));
        grid.add(List.of(1,5,1));
        grid.add(List.of(4,2,1));
        int m=grid.size();
        int n=grid.get(0).size();

        int[][] dp=new int[m][n];
        //Base case of tabulation approach
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                    dp[i][j]=grid.get(0).get(0);
                    continue;
                }

                int Down=Integer.MAX_VALUE; //but it is upwards
                if(i>0) Down=dp[i-1][j];
                int Right=Integer.MAX_VALUE;
                if(j>0) Right=dp[i][j-1];

                dp[i][j]=grid.get(i).get(j)+Math.min(Down,Right);
            }
        }

        System.out.println("Minimum possible path sum is: "+dp[m-1][n-1]);
    }
}

package DSA.Dynamic_Programming;

import java.util.ArrayList;
import java.util.List;
public class minimumPathSum {
    public static int minPathSum(List<List<Integer>> grid,int i,int j){
        //Base case
        if(i==0 && j==0)    return grid.get(0).get(0);
        //If index reaches out of bounds.
        if(i<0 || j<0)  return Integer.MAX_VALUE;

        return grid.get(i).get(j)+Math.min(minPathSum(grid,i-1,j),minPathSum(grid,i,j-1));
    }
    public static void main(String[] args) {
        List<List<Integer>> grid=new ArrayList<>();
        grid.add(List.of(1,3,1));
        grid.add(List.of(1,5,1));
        grid.add(List.of(4,2,1));
        int m=grid.size();
        int n=grid.get(0).size();

        System.out.println(minPathSum(grid,m-1,n-1));

    }
}

package DSA.Dynamic_Programming;

public class NumberOfSquareSubMatricesTabulation {
    public static void main(String[] args) {
        int[][] grid={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int m=grid.length;
        int n=grid[0].length;

        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && i>0 && j>0){
                    grid[i][j]=1+Math.min(grid[i-1][j],Math.min(grid[i][j-1],grid[i-1][j-1]));
                    //Minimum is picking from left,up and left up.
                }
                ans+=grid[i][j];
            }
        }
        System.out.println(ans);
    }
}

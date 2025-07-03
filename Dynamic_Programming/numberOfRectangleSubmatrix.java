package DSA.Dynamic_Programming;

public class numberOfRectangleSubmatrix {
    public static void main(String[] args) {
        int[][] grid={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        //Tabulation Approach
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                /*
                See we apply changes in same grid.
                This is the question keep in ur mind that always ask from
                interviewer that we have to apply changes in same given
                grid that is given in question or we have to make some
                another extra space, Depending upon the choice of interviewer,
                whatever they will tell do that.
                 */
                if(grid[i][j]==1 && i>0 && j>0){
                    grid[i][j]=1+Math.max(grid[i][j-1],Math.max(grid[i-1][j],grid[i-1][j-1]));
                }
                ans+=grid[i][j];
            }
        }
        System.out.println("Number of rectangular matrix can formed is: "+ans);
    }
}

package DSA.Backtracking_Java.BackTracking;

public class Rat_Maze_2_Direction {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        int count = maze(1,1,rows,cols);
        System.out.println("The maximum number of paths are: "+count);
    }

    private static int maze(int stRows, int stCols, int endRows, int endCols) {
        //Base Case.
        if(stRows>endRows || stCols>endCols)    return 0;
        if(stRows==endRows && stCols==endCols) return 1;

        //Recursive Work.
        int downWays = maze(stRows+1,stCols,endRows, endCols);
        int rightWays =  maze(stRows, stCols+1, endRows, endCols);

        //Self Work.
        int totalWays = downWays + rightWays;
        return totalWays;
    }
}

package DSA.Backtracking_Java.BackTracking;

//import static sun.jvm.hotspot.runtime.DeadlockDetector.print;


                        //Not a back Tracking only simple recursion.


public class Rat_Maze_DeadBlocks{
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int[][] maze = {    {1,0,1,1,1,1},
                            {1,1,1,1,0,1},
                            {0,1,1,1,1,1},
                            {0,0,1,0,1,1},
                       }; //Matrix of 4 by 4.

        print(0,0, rows-1, cols-1, " ", maze);
    }

    private static void print(int stRows, int stCols, int endRows, int endCol, String s, int[][] maze) {
        if(stRows>endRows || stCols>endCol) return;

        if(stRows==endRows && stCols==endCol){
            System.out.println(s);
            return;
        }

        if(maze[stRows][stCols]==0) return;
        //go Right
        print(stRows, stCols+1, endRows, endCol, s+"R", maze);

        //go down.
        print(stRows+1, stCols, endRows, endCol, s+"D", maze);
    }
}

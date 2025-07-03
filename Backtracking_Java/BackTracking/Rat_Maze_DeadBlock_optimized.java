package DSA.Backtracking_Java.BackTracking;

public class Rat_Maze_DeadBlock_optimized {
    public static void main(String[] args) {
        //For Backtracking we need an extra array
        int rows = 3;
        int cols = 4;
        int[][] maze = {{1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 0, 1},
        }; //Matrix of 4 by 4.

        print(0, 0, rows - 1, cols - 1,"", maze);
    }
    private static void print(int stRows, int stCols, int endRows, int endCols,String s, int[][] maze){
        if(stRows<0 || stCols<0)    return;

        if(stRows>endRows || stCols>endCols)    return;

        if(stRows==endRows && stCols==endCols){
            System.out.println(s);
            return;
        }

        if(maze[stRows][stCols]==0) return;
        //If it is already true means we have already visited/traversed on it.
        if(maze[stRows][stCols]==-1)   return;

        /*Check.
        //First of all we mark on that index so that we know that we are on our index.
        */
        maze[stRows][stCols] = -1;

        //go Right
        print(stRows, stCols+1 ,endRows, endCols, s+"R", maze);

        //go down
        print(stRows+1, stCols, endRows, endCols, s+"D", maze);

        //go up
        print(stRows-1, stCols, endRows, endCols, s+"U", maze);

        //go left
        print(stRows, stCols-1, endRows, endCols, s+"L", maze);

        //Backtracking
        maze[stRows][stCols] = 1;
    }
    }


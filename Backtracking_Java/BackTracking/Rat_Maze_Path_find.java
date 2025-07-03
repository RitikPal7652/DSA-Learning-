package DSA.Backtracking_Java.BackTracking;
public class Rat_Maze_Path_find {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        path(1, 1, rows, cols, "");
    }
    private static void path(int stRows, int stCols, int endRows, int endCols, String s) {
       //When Rows And Columns reached out of bounds.
        if(stRows>endRows || stCols>endCols)    return;
        //When RowS and Columns are at last index or reaching index.
        if(stRows==endRows && stCols==endCols){
            System.out.println(s);
            return;
        }
        //DownWays.
        path(stRows+1, stCols, endRows,endCols, s+"D");
        //RightWays
    path(stRows, stCols+1, endRows, endCols, s+"R");
    }
}

package DSA.Dynamic_Programming;

public class rat_In_Maze {
    private static int ratMaze(int i,int j){
        //Base case1
        if(i==0 && j==0)    return 1;
        //Base case2
        if(i<0 || j<0)  return 0;
        /*
        Only two ways I have, either downwards or rightwards, and i have started form
        last index. Going from last index to 0,0 index. Here 2D matrix is given for
        traversing.
         */

        return ratMaze(i-1,j)+ratMaze(i,j-1);
    }
    public static void main(String[] args) {
        int m=2;
        int n=2;
        System.out.println(ratMaze(m-1,n-1));
    }
}

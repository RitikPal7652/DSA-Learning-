package DSA.Backtracking_Java.BackTracking;

public class Rat_Mazee_4_Direction {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        //By default false.
        boolean[][] isVisited = new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",isVisited);

    }

    private static void print(int stRows, int stCols, int endRows, int endCols, String s, boolean[][] isVisited) {
        if(stRows<0 || stCols<0)    return;

        if(stRows>endRows || stCols>endCols)    return;

        //Agar vo pehle se hii true hai mtlb hm uspr pehle se hii jaa chuke hai.
        if(isVisited[stRows][stCols]==true)     return;

        if(stRows==endRows && stCols==endCols){
            System.out.println(s);
            return;
        }
        /*
        //Agar hm us index pr pehlii baar jaa rhe hai to pehle uspar true fill kr do taaki hme ye nishani
         mile ki hm us par jaa chuke hai.
       */
        isVisited[stRows][stCols] = true;

        //Go Right.
        print(stRows, stCols+1, endRows, endCols, s+"R", isVisited);

        //go Down
        print(stRows+1, stCols, endRows, endCols, s+"D", isVisited);

        //go Up
        print(stRows-1, stCols, endRows, endCols, s+"U", isVisited);

        //go Left.
        print(stRows, stCols-1, endRows, endCols, s+"L", isVisited);

        /*BackTracking.
        Last me jab saari calls complete ho jaaye to dobara ndex ko false kr do taaki vo dusre path ke liye bhi valid ho.
         */
        isVisited[stRows][stCols] = false;
    }
}

package DSA.Dynamic_Programming;
import java.util.Stack;
public class maximalRectangle {
    public static int getMaxAreaHistogram(int[] histogram) {
        int n = histogram.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++) {
            while(!st.empty() && (i == n || histogram[i] < histogram[st.peek()])) {
                int height=histogram[st.peek()];
                st.pop();

                int weight;
                if(st.empty())
                    weight=i;
                else
                    weight=i-st.peek()-1;

                int area=height*weight;
                maxArea=Math.max(area,maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] grid={
                {1,0,1,0,0},
                {1,0,1,1,1},    //Looking like a matrix.
                {1,1,1,1,1},
                {1,0,0,1,0}
        };
        int M=grid.length;
        int N=grid[0].length;
        int maxArea=0;

        int[] histogram=new int[N];
        //Applying a loop on all 1D array can understand by histogram.
        for(int i=0;i<M;i++){
            //Traverse on each and every new row.
            for(int j=0;j<N;j++){
                /*
                In each new row if 1 is there add previous no. of
                histogram by 1 and if 0 is there then place 0 at that
                index of histogram.
                 */
                if(grid[i][j]==1)  histogram[j]+=1;
                else histogram[j]=0;
            }
            /*
            Now we will find maximum area from each row and then compare the area with maxArea in which previous
            row of maximum area is there.
             */
            int area=getMaxAreaHistogram(histogram);
            System.out.println(area);
            maxArea=Math.max(area,maxArea);
        }
        System.out.println("Maximum Area is: "+maxArea);
    }
}

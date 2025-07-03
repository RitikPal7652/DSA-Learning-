package DSA.Dynamic_Programming;

import java.util.Stack;

public class histrogramAreaStack {
    public static int histogram(int[] histogram) {
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
        int[] histogram={3,1,3,2,2};
        //Finding the area of given histogram.
        System.out.println(histogram(histogram));
    }
}

package DSA.Dynamic_Programming;

public class MatrixChainMultiplicationMCM {
    public static int MCM(int[] arr,int i,int j){
        //Base case
        if(i==j)    return 0;

        int minimum=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            //ans=rec(i,k)+rec(i+1,j)+cost(arr[i-1]+arr[k]+arr[j])
            int ans=MCM(arr,i,k)+MCM(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);

            //Finding minimum from both ans and minimum,as we have to find minimum cost.
            minimum=Math.min(ans,minimum);
        }
        return minimum;
    }
    public static void main(String[] args) {
//        int[] arr={40,20,30,10,30};
        int[] arr={1,2,3,4,3};
        System.out.println(MCM(arr,1,arr.length-1));
    }
}

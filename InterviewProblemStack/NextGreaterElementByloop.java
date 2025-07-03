package DSA.InterviewProblemStack;

public class NextGreaterElementByloop {
    public static int[] nextGreater(int[] arr){
        int[] res = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            res[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    //Time complexity = O(n^2).
    //Space complexity = O(1).
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] res = nextGreater(arr);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}

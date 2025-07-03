package DSA.leetcodeProblems;

public class maximumSubarraySum {
    public static void main(String[] args) {
        int[] arr={3,-4,5,4,-1,7,-8};
        int n=arr.length;

        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                count+=arr[j];
                maxSum=Math.max(count,maxSum);
            }
        }
        System.out.println("Maximum SubArray sum is: "+maxSum);
    }
}

package DSA.leetcodeProblems;

public class kadanesAlgorithm {
    public static void main(String[] args) {
        int[] nums={3,-4,2,-5,7,5};
                int n=nums.length;
                int maxSum=Integer.MIN_VALUE;
                int count=0;
                for(int i=0;i<n;i++){
                    count+=nums[i];
                    maxSum=Math.max(count,maxSum);
                    if(count<0) count=0;
                }
        System.out.println("Kadanes Algorithm: "+maxSum);
            }
        }

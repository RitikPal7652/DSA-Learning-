package DSA.leetcodeProblems;

public class mooreVotingAlgo {
    public static void main(String[] args) {
        /*
        -> Approaches:
        1. Brute force approach: O(n^2)
        2. Optimal approach: O(n*log(n)): by sorting algorithm
        3. Moore's voting algorithm: O(n): by simply done by frequency that
        is given below.

                This is the moore's voting algorithm

         */
        int[] nums={3,2,3};
        int freq=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(nums[i]==ans){
                freq++;
            }else{
                freq--;
            }
        }
        System.out.println("Majority element is: "+ans);
    }
}

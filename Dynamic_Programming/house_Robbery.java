package DSA.Dynamic_Programming;

public class house_Robbery {
    static int calls=0;
    public static int rob(int[] nums,int idx,int[] dp){
        calls++;
        if(idx==nums.length-1)  return nums[idx];
        if(idx>=nums.length)    return 0;

        //Memoization -> dynamic programming (dp).
        if(dp[idx]!=-1) return dp[idx];

        int pick=nums[idx]+rob(nums,idx+2,dp);
        int dont_pick=rob(nums,idx+1,dp);

        return dp[idx]=Math.max(pick,dont_pick);
    }
    public static void main(String[] args) {
        int n=7;
        int[] nums=new int[n];
        nums[0] = 9;
        nums[1] = 1;
        nums[2] = 3;
        nums[3] = 8;
        nums[4] = 2;
        nums[5] = 7;
        nums[6] = 6;
        //Memoization
        int[] dp=new int[n];
        for(int i=0;i<dp.length;i++)    dp[i]=-1;
        int ans=rob(nums,0,dp);
        System.out.println(ans);
        System.out.println(calls);
    }
}

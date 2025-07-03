package DSA.Dynamic_Programming;

import java.util.Scanner;

public class fibinacci_Using_Tabulation {
    static int calls=0;
    public static int fibo(int n,int[] dp){
        calls++;
        //Base case
        if(n==1 || n==2)    return 1;
        //Memoization condition
        if(dp[n]!=-1)   return dp[n];
        //Recurrence relation
        return dp[n]=fibo(n-1, dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        /*
        To solve tabulation, we need to go step by step so that we get
        optimally better solutions.

        1. Firstly find Recursive Solution.
        2. Then memoize it by using DP array.
        3. After memoization apply tabulation by using base condition as our
            first answer and recurrence relation as our main logic inside for
            loop.
        4. Now at the end for finding anything we only need previous two or
            three value so why we use whole array we can store it in two or
            more variables.
        5. By using tabulation this is how we improve complexities:
            O(2^n), O(n) --- for recursive stack.
            O(n), O(n)+O(n)---- for memoization and  recursive function.
            O(n), O(1)---- After applying tabulation
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number you want to print fibonacci: ");
        int n=sc.nextInt();
        //int[] dp=new int[n+1];
        //for(int i=0;i<n+1;i++)    dp[i]=-1;

//        dp[0]=1;    //We know the answer of base condition so we go through it.
//        dp[1]=1;
        int prev1=1;
        int prev2=1;
        int curr=0;
//        for(int i=2;i<=n;i++){
//            dp[i]=dp[i-1]+dp[i-2];
//        }
        for(int i=2;i<=n;i++){
            curr=prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        System.out.println(curr);
        //System.out.println(fibo(n,dp));
        System.out.println(calls);
    }
}

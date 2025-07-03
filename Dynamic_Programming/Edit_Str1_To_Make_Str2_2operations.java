package DSA.Dynamic_Programming;

public class Edit_Str1_To_Make_Str2_2operations {
    public static void main(String[] args) {
        //This is the Tabulation Approach of Longest common Subsequence.
        String s1="AGGTAB";
        String s2="GXTXAYB";

        int m=s1.length();
        int n=s2.length();
        //Make two array current and previous
        int[] curr=new int[n+1];
        int[] prev=new int[n+1];

        //Put zero at first each index of array.
        for(int i=0;i<=n;i++){
            prev[i]=0;
        }

        //Now start from 1st index
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    curr[j]=prev[j-1];
                }
                else{
                    curr[j]=Math.max(prev[j],curr[j-1]);
                }
            }
        }
        /*
        Now as we get longest common subsequence from both the strings.
        1. If we subtract longest common subsequence from the length of s1, then
            string is came on which we have to apply operations.

        2. Similarly, if we subtract longest common subsequence from the length
        of s2, then we get the string or character from whcih we have to apply
        operations.

        If we add both the ans that we get from s1 and s2 then we get our answer
        that is::
                -> Make s2 by adding operations on s1.

                We have options of editing are only::::
                                                         Insert and Remove.
         */
        int operations=(s1.length()-prev[n])+(s2.length()-prev[n]);
        System.out.println("Minimum Operations that can be applied is: "+operations);
    }
}

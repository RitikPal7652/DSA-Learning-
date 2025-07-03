package DSA.Dynamic_Programming;

import java.util.Arrays;

public class Edit_str1_ToMake_str2_Tabulation2 {
    public static void main(String[] args) {
        String s1="SUNDAY";
        String s2="SATURDAY";

        int m=s1.length();
        int n=s2.length();

        int[] curr=new int[n+1];
        int[] prev=new int[n+1];
        //Base case
        //i ki value 0 ke liye value hamesha i rhegii.
        for(int i=0;i<=n;i++)   prev[i]=i;

        for(int i=1;i<=m;i++){
            //This is actually a 2nd base condition.
            curr[0]=i;//Because 2nd base condition is not hit.
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    curr[j]=prev[j-1];
                    continue;
                }
                int replace=1+prev[j-1];
                int insertion=1+curr[j-1];
                int deletion=1+prev[j];

                curr[j]=Math.min(replace,Math.min(insertion,deletion));
            }
            //In java, shallow copy made so we do this.
            prev= Arrays.copyOf(curr,n+1);
        }
        System.out.println(prev[n]);
    }
}

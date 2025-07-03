package DSA.Dynamic_Programming;

import java.util.List;
public class WordBreak_Tabulation {
    public static void main(String[] args) {
        String s="applepenapple";
        List<String> wordDict= List.of("apple","pen");
        int n=s.length();
        int[] dp=new int[n+1];

        //Base condition of memoization
        dp[n]=1;

        //This loop is for recursive iteration
        for(int idx=n-1;idx>=0;idx--){
            for(int i=idx;i<s.length();i++){
                String prefix=s.substring(idx,i+1);
                //Comparing is prefix string present in wordDictionary string
                if(wordDict.contains(prefix)){
                    //Recursion on suffix.
                    if(dp[i+1]==1){
                        dp[idx]=1;
                    }
                }
            }
        }
        System.out.println(dp[0]);
    }
}

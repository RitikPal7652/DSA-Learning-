package DSA.Dynamic_Programming;
import java.util.Arrays;
import java.util.List;
public class wordBreak_Memoization {
    public static int wordBreak_Rec(String s,int idx,List<String> wordDict,int[] dp){
        //Base case
        if(idx==s.length()) return 1;
        //Memoization
        if(dp[idx]!=-1) return dp[idx];

        for(int i=idx;i<s.length();i++){
            String prefix=s.substring(idx,i+1);
            //Comparing is prefix string present in wordDictionary string
            if(wordDict.contains(prefix)){
                if(wordBreak_Rec(s,i+1,wordDict,dp)==1){
                    return dp[idx]=1;
                }
                else    return dp[idx]=0;
            }
        }
        return dp[idx]=0;
    }
    public static void main(String[] args) {
        String s="applepenapplen";
        List<String> wordDict= List.of("apple","pen");
        int n=s.length();
        //Memoization. Recursive state is depending on only one variable that is idx.
        int[] dp=new int[n];
        //Place -1 at every index of array
        Arrays.fill(dp,-1);
//        for(int i=0;i<dp.length;i++)    dp[i]=-1;

        System.out.println(wordBreak_Rec(s,0,wordDict,dp));

        //Prepare debugging concept. Important in software development if not understand the code.
    }
}

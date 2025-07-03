package DSA.Dynamic_Programming;
import java.util.List;
public class Word_Break {
    public static boolean wordBreak_Recursion(String s,int idx,List<String> wordDict){
        //Base case
        if(idx==s.length()) return true;
        for(int i=idx;i<s.length();i++){
            String prefix=s.substring(idx,i+1);
            if(wordDict.contains(prefix)) {
                //Apply recursion on suffix. No need to find string of suffix again.
                return wordBreak_Recursion(s,i+1,wordDict);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="applepenapplen";
        List<String> wordDict= List.of("apple","pen");
        int n=wordDict.size();
        System.out.println(wordBreak_Recursion(s,0,wordDict));
    }
}

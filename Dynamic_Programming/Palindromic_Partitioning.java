package DSA.Dynamic_Programming;
import java.util.ArrayList;
import java.util.List;
public class Palindromic_Partitioning {
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))    return false;
//            i++;
//            j--;
        }
        return true;
    }
    public static void recPartition(String s,int idx,List<List<String>> result,List<String> ans){
        //Base case
        if(idx==s.length()){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<s.length();i++){
            //Finding part of string that is palindrome.
           String stString=s.substring(idx,i+1);
           if(isPalindrome(stString)){
               ans.add(stString);
               recPartition(s,i+1,result,ans);
               //Backtracking
               ans.remove(ans.size()-1);
           }
        }
    }
    public static void main(String[] args) {
        String s="Ritik";
        List<List<String>> result=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        //Finding all the possible substring of a given string that is palindrome.
        recPartition(s,0,result,ans);
        System.out.println(result);
    }
}

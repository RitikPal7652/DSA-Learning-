package DSA.Strings.Strings;
import java.util.*;
public class Palindrome {
    //Calculate the number of palindromic substring are present in a given string.
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
            return true;
    }
    public static void main(String[] args) {
        String s = "abcba";
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isPalindrome(s.substring(i, j)) == true) {
                    System.out.print(s.substring(i, j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\nTotal Number of Palindromic substrings are: "+count);
    }
}

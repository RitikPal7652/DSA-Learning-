package DSA.Strings.Strings;
import java.util.*;
public class CalculateDuplicates {
    static void duplicatesWrite(String s) { //LEETCODE MEDIUM
        /*
        PSEUDOCODE:
        1. Initialise a answer string in which first letter of string is already append.
        2. Traverse over the whole String ,starts from 1st Index and check if current character is equal
            to previous character then increement count by 1 which is already initialised by 1.
        3. When current character is not equal to its previous character it means we are present on
            another character.
        4. This is the time to append count in answer string and make count variable again as 1 and also
            append current character in answer string.
        5. Outside the loop, our line also wrote that, ans+=count for last alphabet.
         */
        String ans = "" + s.charAt(0); //ans = s.charAt(0) wrong(X) gives error.
        int count = 1;

        //Loop start from 1st index as 0th index is already present in the answer string.
        for (int i = 1; i < s.length(); i++) {

            //Current character and previous character also changes according to loop.
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr==prev){
                count++;
            }
            else{
                if(count>1) {   //Condition because we don't want to write e1 if there is single element
                    ans += count;        // no need to write 1 after the current element.
                }
                count=1;
                ans += curr;
            }
        }
        //So that last count is also append in the answer string.
        if(count>1)   ans += count;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "aaabbbccddddee";
        duplicatesWrite(s);
    }
}

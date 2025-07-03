package DSA.Strings.Strings;
import java.util.*;
public class reverseWord {
    static void reverseWordSentnce(String s){
        /*
        PSEUDOCODE:
         First of all, make a answer string in which our answer is store and we need to print it.
        Then make a String Builder in which we perform all the actions.

        1. Traverse the whole string and store it in a stringBuilder until itertor reach on the end
            of word.
        2. When iterator reach at the end of word,
                I. First of all reverse the whole word.
                II. Then, append it into our answer string by arithmetic operations.
                III. Give a space in answer string.
                IV. Make sure that after these operations you were delete the all the words that
                    are present in stringBuilder.
                V. Outside the loop write two more lines of code that are:
                            (a). reverse the string.
                            (b). Append it into the answer.
        3. At last, print the answer string.
         */
        String ans = "";
        StringBuilder strbldr = new StringBuilder("");

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch!=' '){
                strbldr.append(ch);
            }
            else{           // ch==' '
                strbldr.reverse();
                ans+=strbldr;
                ans+=" ";
                strbldr = new StringBuilder("");
            }
        }
        strbldr.reverse();
        ans+=strbldr;

        System.out.println(ans);
    }
    public static void main(String[] args) {
        String s = "erem DaD si tseb";
        reverseWordSentnce(s);
    }
}

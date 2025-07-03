package DSA.InterviewProblemStack;
import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') st.push(ch);
            else {
               if(st.size()==0)  return false;
               if(st.peek()=='(')   st.pop();
            }
        }
        if(st.peek()>0)  return false;
        else    return true;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println(isBalanced(s));
    }
}

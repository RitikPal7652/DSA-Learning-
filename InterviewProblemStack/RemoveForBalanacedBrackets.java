package DSA.InterviewProblemStack;

import java.util.*;

public class RemoveForBalanacedBrackets {
    public static int removeUnbalancedBrackets(String s) {
        Stack<Character> st = new Stack<>();
        int remove = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) {
                    remove = 1;
                    return remove;
                }
                if(st.peek()=='(')  st.pop();
            }
        }
        if(st.size()==0) {
            System.out.println("No need to remove any bracket!");
        }
        else{
            while(st.size()!=0){
                st.pop();
                remove++;
            }
        }
        return remove;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();

        int bal = removeUnbalancedBrackets(s);
        System.out.println("No. of brackets need to remove is: "+bal);
    }
}

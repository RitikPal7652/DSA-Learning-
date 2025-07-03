package DSA.InterviewProblemStack;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesisLeetcde20 {
    boolean validParanthesis(String s){
        Stack<Character> st = new Stack<>();
        int n=s.length();
        char mh = '0';

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[')   st.push(ch);    //Means if bracket is open.
            else{                                               //Means if bracket is closed.
                if(ch==')')     mh='(';
                if(ch=='}')     mh='{';
                if(ch==']')     mh='[';

                if(st.size()==0)        return false;
                if(st.peek()!=mh)       return false;
                if(st.peek()==mh)       st.pop();
            }
        }
        if(st.size()>0)     return false;
        else                return true;
    }
    public static void main(String[] args) {
        validParanthesisLeetcde20 v = new validParanthesisLeetcde20();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println(v.validParanthesis(s));
    }
}

package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class balanceBrackets {
    boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0)    return false;
                if(st.peek()=='(')  st.pop();
            }
        }

        if(st.size()!=0)    return false;
        else return true;
    }
    public static void main(String[] args) {
        balanceBrackets b = new balanceBrackets();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();

        System.out.println(b.isBalanced(s));
    }
}

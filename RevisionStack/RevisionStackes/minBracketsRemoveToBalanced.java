package DSA.RevisionStack.RevisionStackes;

import java.util.Scanner;
import java.util.Stack;

public class minBracketsRemoveToBalanced {
    public static int bracketsRemove(String s){
        Stack<Character> st = new Stack<>();
        int no = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }
            else{   //ch==')'
                if(st.size()==0)    return 1;
                if(st.peek()=='(')  st.pop();
            }
        }
        while(st.size()!=0){
            no++;
            st.pop();
        }
        return no;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int remove = bracketsRemove(s);
        System.out.println("Min no. of brackets to remove is: "+remove);
    }
}

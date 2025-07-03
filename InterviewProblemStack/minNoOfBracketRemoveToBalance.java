package DSA.InterviewProblemStack;

import java.util.Scanner;
import java.util.Stack;

public class minNoOfBracketRemoveToBalance {
    public static int removeBal(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int size = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') st.push(ch);
            else {
                if (st.size() == 0) return 1;
                if (st.peek() == '(') st.pop();
            }
        }
        if (st.size() == 0) {
            System.out.println("No need to remove any bracket: BALANCED");
            return 0;
        } else {
            while (st.size() > 0) {
                st.pop();
                size++;
            }
            return size;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();

        System.out.println("Minimum no. of brackets remove so that it will become balanced: "+removeBal(s));
    }
}

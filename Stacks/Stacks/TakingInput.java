package DSA.Stacks.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.println("Enter the number of elements which u want to enter");
        int n = sc.nextInt();
        System.out.println("Enter the element");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}

package DSA.Problems.problems;

import java.util.Scanner;
public class vowelsCalculate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       // System.out.println(“Enter the string: ”);
        String s = scn.nextLine();
        System.out.print(count(s));
    }
    public static int count(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
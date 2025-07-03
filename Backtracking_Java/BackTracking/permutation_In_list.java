package DSA.Backtracking_Java.BackTracking;
import java.util.*;
public class permutation_In_list {
    static void printList(String str, String t, List<String> list){
        //Base Case.
        if(str.equals("")){
            list.add(t);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);// Exclusively.
            String right = str.substring(i+1);

            String rem = left+right;
            //Call Recursively.
            printList(rem, t+ch, list);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        printList(s,"", list);

        //For-Each Syntax to print list.
        for(String i: list){
            System.out.println(i);
        }
    }
}

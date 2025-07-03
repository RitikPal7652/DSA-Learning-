package DSA.Backtracking_Java.BackTracking;

public class permutations_1 {
    static void print(String str, String t){
        if(str.equals("")){
            System.out.println(t);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);//where i is exclusive.
            String right = str.substring(i+1);
            String rem = left+right;

            //Call recursive Function.
            print(rem, t+ch);
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        //return all possible combinations of given string.
        print(s, " ");
    }
}

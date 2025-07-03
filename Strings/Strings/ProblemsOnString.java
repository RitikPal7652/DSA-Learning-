package DSA.Strings.Strings;
import java.util.*;
public class ProblemsOnString {

    static void palindrome(){
        //Check that the given String is Palindrome or not.
        String str = "abcda";
        int i=0;
        int j=str.length()-1;
        boolean flag = true;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        if(flag==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    static void toggle2(String s){ //Very good Performance.
        /*
        To make string toggle, first of all pass String and then Make stringbuilder and make all the
        work in stringbuilder.
        By using stringbuilder we can save many operations which were done in simple string operations.
         */
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            boolean flag = true;

            if(ascii>=97){
                flag = false;
            }

            if(flag == true){
                ascii+=32;
                char cha = (char)ascii;
                str.setCharAt(i, cha);
            }
            else{
                ascii-=32;
                char cha = (char)ascii;
                str.setCharAt(i, cha);
            }
        }
        System.out.println(str);
    }
    static void toggle1A(StringBuilder s){
       // StringBuilder s = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            boolean flag = true;
            char ch = s.charAt(i);

            if(ch == ' '){
                continue;
            }
            int asci = (int)ch;

            if(asci>=97) flag = false;
            if(flag == true){
                asci += 32;
                char add = (char)asci;
                s.setCharAt(i, add);
            }
            else{
                asci-=32;
                char add = (char)asci;
                s.setCharAt(i, add);
            }
        }
        System.out.println(s);
    }
    static void toggle1(String s){
        //But it has very poor performance.
        for(int i=0; i<s.length(); i++){
            // A -> Z (65 -> 90)   ||  a -> z (97 -> 132)
            boolean flag = true;
            char ch = s.charAt(i);
            if(ch==' '){
                continue;
            }
            int ascii = (int)ch;

            if(ascii>=97){
                flag = false;
            }

            if(flag==true){
                ascii+=32;
                char ans = (char)ascii;
                s = s.substring(0, i) + ans + s.substring(i+1);
            }
            else{
                ascii-=32;
                char ans = (char)ascii;
                s = s.substring(0,i) + ans + s.substring(i+1);
            }
        }
        System.out.println(s);
    }

    static void toggleStringBuilder(){
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;

            if(ascii>=65 && ascii<=90){
                ascii += 32;
                char cha = (char)ascii;
                str.setCharAt(i, cha);
            }
            else{
                ascii -= 32;
                char cha = (char)ascii;
                str.setCharAt(i, cha);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String s = "PhysiCS WallAh";
        palindrome();
      //  System.out.println(s);

    }
}

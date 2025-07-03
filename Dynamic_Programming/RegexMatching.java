package DSA.Dynamic_Programming;

public class RegexMatching {
    public static boolean matching_Rec(String s,String p,int i,int j){
        //Base case 1
        if(i==-1 && j==-1)  return true;
        //Base case 2
        if(j==-1 && i>=0)   return false;
        //Base case 3
        if(j>=0 && i==-1){
            boolean flag=true;
            //See whether all the characters are * or not. If yes then true else false.
            for(int x=0;x<j;x++){
                if(p.charAt(x)!='*')    flag=false;
            }
            return flag;
        }

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
            return matching_Rec(s,p,i-1,j-1);
        }
        else if(p.charAt(j)=='*'){
            //I have to do two things: either [ignore] or [take].
           return matching_Rec(s,p,i,j-1) || matching_Rec(s,p,i-1,j);
        }
        else  {
            return false;
        }
    }
    public static void main(String[] args) {
        String s="abbbac";
        String p=".*a*";

        System.out.println(matching_Rec(s,p,s.length()-1,p.length()-1));
    }
}

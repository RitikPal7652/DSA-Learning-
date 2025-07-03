package DSA.Dynamic_Programming;

public class Edit_Str1_To_Make_Str2_3operations {
    public static int lcs(String s1,String s2,int i,int j){
        //Base Case.

        if(i==-1)   return j+1;

        if(j==-1)   return i+1;
        //If same then we do need to do anything, just go before.
        if(s1.charAt(i)==s2.charAt(j))
            return lcs(s1,s2,i-1,j-1);

            //Means if both the characters are not equal
        int replace=1+lcs(s1,s2,i-1,j-1);
        int insertion=1+lcs(s1,s2,i,j-1);
        int deletion=1+lcs(s1,s2,i-1,j);

        return Math.min(replace,Math.min(insertion,deletion));
    }
    public static void main(String[] args) {
        String s1="CAT";
        String s2="CUT";
        int m=s1.length();
        int n=s2.length();

        System.out.println("Minimum number of Operations we need to apply is: "+lcs(s1,s2,m-1,n-1));

    }
}

package DSA.Dynamic_Programming;

public class ratMaze_Perm_Comb {
    public static void main(String[] args) {
        int m=3;
        int n=3;

        /*
        Formula is: (m+n-2)!/(m-1)!*(n-1)!
         */
        int numerator=(m+n-2);

        int deno1=m-1;
        int deno2=n-1;

        int ans1=1;
        int ans2=1;
        int ans3=1;
        //Calculating numerator factorial
        for(int i=numerator;i>=1;i--)
            ans1*=i;

        //Calculating denominator answer
        for(int i=deno1;i>=1;i--)
                ans2*=i;

        for(int i=deno2;i>=1;i--)
            ans3*=i;

        int actDeno=ans2*ans3;
        int ans=ans1/actDeno;
        System.out.println(ans);

    }
}

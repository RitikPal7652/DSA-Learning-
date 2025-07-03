package DSA.leetcodeProblems;

public class powerByBinaryExponentiation {
    public static double myPow(double x, int n) {
        //By using binary exponentiation

        //Edge cases
        if(n==0)    return 1.0;
        if(x==0)    return 0.0;
        if(x==1)    return 1.0;
        if(x==1 && n%2==0)  return 1.0; //even case
        if(x==1 && n%2==1)  return -1.0;//odd case

        long binaryForm=n;

        //if value of n is negative
        if(n<0){
            x=1/x;
            binaryForm=-binaryForm; //binaryform is also n.
        }
        double ans=1;

        while(binaryForm>0){
            if(binaryForm % 2==1){
                ans*=x;
            }
            x*=x;//x should always updated.
            //update binaryform also
            binaryForm/=2;
        }
        return ans;
    }

    public static void main(String[] args) {
        double x=2;
        int n=10;
        double ans=myPow(x,n);
        System.out.println(ans);
    }
}

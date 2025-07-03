package DSA.Dynamic_Programming;

public class catalanNumbers {
    public static int catalanNumber(int n){
        if(n==0 || n==1)    return 1;
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalanNumber(i)*catalanNumber(n-i-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(catalanNumber(n));
    }
}

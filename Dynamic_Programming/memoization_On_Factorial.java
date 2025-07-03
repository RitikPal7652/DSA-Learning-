package DSA.Dynamic_Programming;

public class memoization_On_Factorial {
    static int count=0;
    private static int fibo(int n,int[] d){
        if(n==0 || n==1)  {
            return 1;
        }
        //Memoization
        if(d[n]!=-1)   {
            return d[n];
        }
        count++;

        return d[n]=fibo(n-1,d)+fibo(n-2,d);
    }
    public static void main(String[] args) {
        int n=15;
        int[] d=new int[n+1];
        //Place -1 at each index of array.
        for(int i=0;i<=n;i++){
            d[i]=-1;
        }
        System.out.println(fibo(n, d));
        System.out.println("Count is: "+count);
    }
}

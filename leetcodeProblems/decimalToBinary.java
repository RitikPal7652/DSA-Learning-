package DSA.leetcodeProblems;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        int pow=1; //10 raise to power to 0.
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int remainder=n%2;
            n/=2;

            ans+=(remainder*pow);
            pow*=10;
        }
        System.out.println("Decimal to Binary is: "+ans);
    }
}

package DSA.leetcodeProblems;

import java.util.Scanner;

public class binaryToDecinal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int n=sc.nextInt();
        int ans=0;
        int pow=1;

        while(n>0){
            int rem=n%10;
            n/=10;

            ans+=(rem*pow);
            pow*=2;
        }
        System.out.println("Binary to decimal conversion is: "+ans);
    }
}

package DSA.Graph;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //char n=sc.next().charAt(0);
//        int num=1;
//        for(int i=1;i<=n;i++){
//            int j=1;
//            while(j<=n){
//
//                System.out.print(num+" ");
//                num++;
//                j++;
//            }
//            System.out.println();
//        }
//        for(char i='A';i<=n;i++){
//            for(char j='A';j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        char num='A';
//        for(char i='A';i<=n;i++){
//            for(char j='A';j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){   //Rows
//            for(int j=0;j<i;j++) {//Spaces
//                System.out.print(" ");
//            }
//
//            for(int k=0;k<n-i;k++){
//                System.out.print(i+1);
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            //spaces
//            for(int j=0;j<=n-i-1;j++){
//                System.out.print(" ");
//            }
//            //num1.
//            for(int k=1;k<=i+1;k++)
//                System.out.print(k);
//            //num2.
//            for(int l=i;l>0;l--)
//                System.out.print(l);
//            System.out.println();
//        }

        //Print upper part of diamond.
        for(int i=0;i<n;i++) {
            //spaces and star.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            //Again spaces and star.
            if (i != 0) {
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        //Print bottom part of diamond.
        for(int i=0;i<n-1;i++) {
            //Print spaces and star
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");

            //Print spaces and star
            if (i!=n-2){
                for(int j=0;j<(2*(n-2-i));j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

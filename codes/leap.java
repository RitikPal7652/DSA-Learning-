package DSA.codes;

import java.util.Scanner;
public class leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        //int ans = 1;
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
package DSA.StackProblem.StackProblem;

import java.util.Scanner;
class maths{
    int a;
    int b;
    int c;
       public int Average(){// Method for calculating the average of three numbers.
        int ans = (a+b+c)/3;
        return ans;
    }
}
public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maths al = new maths();
        System.out.println("Enter the value of a: ");
        al.a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        al.b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        al.c = sc.nextInt();

        int ans = al.Average();
        System.out.println("Average of three given Numbers is: "+ans);
    }
}

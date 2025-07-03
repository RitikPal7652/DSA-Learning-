package DSA.FindingRoot;

import java.util.*;

public class roots {
    public static void main(String[] args) {
        int a,b,c,d;
        double r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        System.out.println("Enter the value of c");
        c = sc.nextInt();

        //To find the value of d.
        d = (b*b)-(4*a*c);

        if(d==0){
            System.out.println("Real and Equal Roots");
            r1 = (-b)/(2*a);
            r2 = (-b)/(2*a);
            System.out.println("Root are "+r1+" and "+r2+"");
        }
        else if(d>0){
            System.out.println("Real and Distinct root");
            r1 = ((-b)+Math.sqrt(d))/(2*a);
            r2 = ((-b)-Math.sqrt(d))/(2*a);
            System.out.println("Root are "+r1+" and "+r2+"");
        }
        else{
            System.out.println("Roots are IMAGINARY");
        }
    }
}

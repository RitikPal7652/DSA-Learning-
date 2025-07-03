package DSA.skills.skills;

import java.util.Scanner;

class Algebra{
    Algebra(){
        System.out.println("Math is known as algebra");
    }
    int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
}
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algebra al = new Algebra();
        int a = sc.nextInt();
        int b = sc.nextInt();

       int ans = al.sum(a, b);
        System.out.println("Sum of the given two numbers is: "+ans);
    }
}

class App2{

}

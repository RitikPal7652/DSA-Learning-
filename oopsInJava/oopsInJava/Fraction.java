package DSA.oopsInJava.oopsInJava;

public class Fraction {
    public static fraction division(fraction f1, fraction f2){
        int num = f1.num*f2.den;
        int den = f1.den*f2.num;

        fraction f3 = new fraction(num, den);
        return f3;
    }
    public static fraction substraction(fraction f1, fraction f2){
        int num = f1.num*f2.den - f2.num*f1.den;
        int den = f1.den*f2.den;

        fraction f3 = new fraction(num, den);
        return f3;
    }
    public static fraction multiplication(fraction f1, fraction f2){
        int num = f1.num*f2.num;
        int den = f1.den*f2.den;

        fraction f3 = new fraction(num, den);
        return f3;
    }
    public static int gcd(int num, int den) {
        int min = Math.min(num, den);

        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i; //It will always return bcoz every number has hcf 1 atleast.
            }
        }
        return min;
    }

    public static fraction add(fraction f1, fraction f2){
        int num = f1.num*f2.den + f2.num*f1.den;
        int den = f1.den*f2.den;

        fraction f3 = new fraction(num, den);
        return f3;
    }

    //Making a fraction class.
    public static class fraction {
        int num; //num and den are known as attributes of class.
        int den;

        //Making a Fraction Parameterized Constructor.
        public fraction(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify() {
        /*
        If we find the H.C.F. of numerator and denominator and then divide by numerator and denominator
        by given H.C.F. then it will be simplify.
        */
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }
        public static void main(String[] args) {
            fraction f1 = new fraction(6, 7); //Make an object name f1.
            System.out.println(f1.num+"/"+f1.den);

            fraction f2 = new fraction(3,7);
            System.out.println(f2.num+"/"+f2.den);

            fraction f3 = add(f1,f2);
            System.out.println("Addition of two Fraction is: ");
            System.out.println(f3.num+"/"+f3.den);

            fraction f4 = multiplication(f1, f2);
            System.out.println("Multiplication of two Fraction is: ");
            System.out.println(f4.num+"/"+f4.den);

            fraction f5 = substraction(f1, f2);
            System.out.println("Subtraction of two Fraction is: ");
            System.out.println(f5.num+"/"+f2.den);

            fraction f6 = division(f1, f2);
           System.out.println("Division of two Fraction is: ");
            System.out.println(f6.num+"/"+f6.den);
        }
    }


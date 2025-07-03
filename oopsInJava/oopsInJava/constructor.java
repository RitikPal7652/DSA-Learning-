package DSA.oopsInJava.oopsInJava;

public class constructor {
    public static void main(String[] args) {

        System.out.println("With Argument");
        StudentClass s = new StudentClass("Ritik", 95, 96.3);
        System.out.println(s.name);
        System.out.println(s.rollNo);
        System.out.println(s.percentage);

        StudentClass s1 = new StudentClass();
        s1.name = "Gagan";
        s1.percentage = 8.9;
        s1.rollNo = 23;

        System.out.println();
        System.out.println("Without Argument");
        System.out.println(s1.percentage);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
    }
}

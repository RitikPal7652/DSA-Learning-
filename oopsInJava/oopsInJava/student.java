package DSA.oopsInJava.oopsInJava;

public class student {
    public static void main(String[] args) {

        /* By using getter we can access only by objects but if we make our function static then we
           can access this function by our directly class also. No need to make objects.
           Without making objects all things will be sorted.

         */
        System.out.println(StudentClass.getNoOfStudents()); //Class is our StudentClass not student
        StudentClass s1 = new StudentClass("Ritik", 97, 98.2); //Creating an Object. DECLARATION
//        System.out.println(s1.name);
//        System.out.println(s1.rollNo);
//        System.out.println(s1.percentage);

        StudentClass s2 = new StudentClass("Gagan", 97, 98.2); //Creating an Object. DECLARATION
//        System.out.println(s2.name);
//        System.out.println(s2.rollNo);
//        System.out.println(s2.percentage);
//        System.out.println(s2.noOfStudents);

        StudentClass s3 = new StudentClass("Deepak", 97, 98.2); //Creating an Object. DECLARATION
//        System.out.println(s3.name);
//        System.out.println(s3.rollNo);
//        System.out.println(s3.percentage);
        System.out.println(s1.getNoOfStudents());
        System.out.println(s2.getNoOfStudents());
        System.out.println(s3.getNoOfStudents());

//        System.out.println(s1.getRollNo());
//        s1.setRollNo(76);
//        fn(s1);
//        System.out.println(s1.name);
//        System.out.println(s1.rollNo);
//        System.out.println(s1.percentage);
//
//        Student s2 = new Student();
//        s2.name = "Gagan Pal";
//        s2.rollNo = 214519;
//        s2.percentage = 8.09;
//
//        System.out.println(s2.name);
//        System.out.println(s2.rollNo);
//        System.out.println(s2.percentage);
    }
}

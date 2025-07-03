package DSA.OOPS;

class Student{
    String name;
    int age;

    void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
    Student(Student s2) { //Copy constructor bcoz we copy all values of s1 in s2.
        this.age = s2.age;//ye student 2 ki information ko copy krke apne current object me daal rha hai.
        this.name = s2.name;
    }
        Student(){
            //So that our first constructor willl work bcoz in main function two objects were made.
        }

    }

public class oops {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "ritik";
    s1.age = 20;

    Student s2 = new Student(s1); //copy of constructor. We copy s1 in s2.
    s2.printInfo();
    }
}

package DSA.oopsInJava.oopsInJava;


//We can create student class in different files also.
public class StudentClass {
    String name;
    int rollNo;
    double percentage;
    private static int noOfStudents;  //Static

    public StudentClass(){  //default constructor.

    }
    //When we make constructor only data types and variable name pass. Here we can't pass actual arguments.
    public StudentClass(String naam, int rol, double percent){ //Parameterized Constructor
        name = naam;
        rollNo = rol;
        percentage = percent;
        noOfStudents++;
    }

    public static int getNoOfStudents(){
        return noOfStudents; //We return a static variable but our function is not static so it gives an error.
    }
    public int getRollNo(){  //We access roll number even it is private by using getter function.
        return rollNo;
    }

    public void setRollNo(int roll){ //We change the value of roll Number even it is private.
        rollNo = roll;
        System.out.println(rollNo);
    }
    }


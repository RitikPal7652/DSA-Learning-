package DSA.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ImplementationPQ {
    public static class Student{
        String name;
        Integer rollNo;
        Integer marks;
        String dob;
    }
    private static class StudentComparator implements Comparator<Student>{ //Comparator Interface
        //Overriding

        //By default Min Heap is there.
        /*
        1. Pehle isne dekha kii Ritik ke marks km hai to isne use hi top pe rkh diya, koi
            swapping nhi hui.
        2.
         */
        public int compare(Student s1,Student s2){  //For Descending Order.
            if(s1.marks>s2.marks)   return 1;       //For 1: To s2 ko priority do.
            else if(s1.marks<s2.marks)  return -1;  //For -1:s1 ko priority do
            else {      //If both are equal.
                if(s1.rollNo>s2.rollNo) return 1;
                else if(s1.rollNo<s2.rollNo)    return -1; //reverse kro and s1 ko priority do
                else    return 0;  //for equality.
            }
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq1=new PriorityQueue<>(new StudentComparator());
        
        Student Ritik=new Student();
        Ritik.name="Ritik";
        Ritik.rollNo=34;
        Ritik.marks=99;
        Ritik.dob="12-07-2004";

        Student Raghav=new Student();
        Raghav.name="Raghav";
        Raghav.rollNo=65;
        Raghav.marks=95;
        Raghav.dob="24-09-2004";

        pq1.add(Ritik);
        pq1.add(Raghav);
        System.out.println(pq1.peek().name);
        System.out.println(pq1.peek().marks);
        System.out.println(pq1.peek().dob);
        System.out.println(pq1.peek().rollNo );

//        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
//        pq.add(10);
//        pq.add(20);
//        pq.add(30);
//        pq.add(40);
//        pq.add(50);
//        pq.remove();
//        System.out.println(pq.peek());
    }
}
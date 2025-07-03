package DSA.codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
                                //ASSIGNMENT QUESTIONS.
public class AssignmentArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(-4);
        l1.add(-8);
        l1.add(0);
        l1.add(8);
        l1.add(-3);
        l1.add(-2);
        for(int i=0; i < l1.size(); i++){
            if(l1.get(i)>=0){
                System.out.println(l1.get(i));
            }
        }
        System.out.println("NA");
//  System.out.println("NA");
//        l1.add(3);
//        l1.add(5);
//        l1.add(1);
//        l1.add(-4);
//        l1.add(9);
//        l1.add(0);
//        l1.add(-2);
//     4.   Collections.sort(l1);
//        System.out.println(l1);
//
//        l1.add(0);
//        l1.add(-1);
//        Collections.sort(l1);
//        System.out.println(l1);
//   1.     l1.add(0, 10);
//        System.out.println(l1);

//     2. Assignment Question
//          l1.remove(2);
//        System.out.println(l1);

//      3.  Collections.swap(l1, 2, 4);
//        System.out.println(l1);

    }
    }

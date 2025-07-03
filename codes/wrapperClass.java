package DSA.codes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class wrapperClass {
    static void reverseArraylists(ArrayList<Integer> l1){
            int i=0, j=l1.size()-1;

            while (i<j){
                Integer temp = l1.get(i);
                l1.set(i, l1.get(j));
                l1.set(j, temp);
                i++;
                j--;
            }
        System.out.println(l1);
        }
   public static void main(String[] args) {
       ArrayList<Integer> l1 = new ArrayList<>();

       //Add element in the end of Arraylist.
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(8);
       l1.add(9);

//       int lastindexOf(l1);
       //       System.out.println(l1);
//       Collections.reverse(l1);
//       System.out.println(l1);
        //reverseArraylists(l1);
//       Collections.sort(l1);
//       System.out.println(l1);
//
//       Collections.sort(l1, Collections.reverseOrder());
//       System.out.println(l1);
//
//       Collections.rotate(l1, 3);
//       System.out.println(l1);
    ArrayList<String> s = new ArrayList<>();
    s.add("My");
    s.add("Name");
    s.add("Is");
    s.add("Ritik");
       System.out.println(s);
       Collections.sort(s);
       System.out.println(s);
        /*
        Integer i = Integer.valueOf(5);
        System.out.println(i);

        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        To print or get the element from the ArrayList.
        System.out.println(l1.get(1));
        System.out.println(l1);
        for(int i=0; i<l1.size(); i++){ //Size() is a method for length of ArrayList.
            System.out.print(l1.get(i) + " ");
        }
        l1.add(1, 100);
        System.out.println(l1);

        //To set the element at any Index.
        l1.set(1, 10);
        System.out.println(l1);

        //To remove the eleement from any Index.
        l1.remove(1);
        System.out.println(l1);

        //To remove the eleement when index is not known.
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);

        //It gives Boolean type.
        System.out.println(l1.remove(Integer.valueOf(8)));

        //To check that the element exists in the Arraylist or not.
        boolean ans = l1.contains(Integer.valueOf(5));
        System.out.println(ans);

        boolean anss = l1.contains(Integer.valueOf(50));
        System.out.println(anss);

        ArrayList l = new ArrayList();
        l.add("RITIK");
        l.add(5);
        l.add(true);
        System.out.println(l);

         */

    }
}

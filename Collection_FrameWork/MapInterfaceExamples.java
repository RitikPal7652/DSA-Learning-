package DSA.Collection_FrameWork;

import java.util.*;

public class MapInterfaceExamples {
    static void HashMap(){
        Map<Integer, String> mp = new HashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Sohan");
        mp.put(1, "Priya"); //Updating value considerd.
        System.out.println(mp);
        System.out.println(mp.get(1));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Sohan"));
    }

    static void LinkedHashMap(){
        Map<Integer, String > mp = new LinkedHashMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Sohan");
        System.out.println(mp);
    }

    static void TreeMap(){
        Map<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Sohan");
        System.out.println(mp);
    }
    public static void main(String[] args) {
        //HashMap();
        //LinkedHashMap(); //Order of Insertion maintains.
        TreeMap();          //Sorted Order
    }
}

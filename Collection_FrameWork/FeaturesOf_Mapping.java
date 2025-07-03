package DSA.Collection_FrameWork;

import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class FeaturesOf_Mapping {
    public static void main(String[] args) {
        Map<Integer, String> mp = new TreeMap<>();
        mp.put(3, "Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Sohan");

        for(Integer i : mp.keySet()){
            System.out.println(i);
        }

        for(var i : mp.entrySet()){
            System.out.println(i);
        }

        for(var i : mp.entrySet()){
            System.out.println(mp.keySet());
        }

        for(var i : mp.entrySet()){
            System.out.println(i.getKey());
        }

        for(var i : mp.entrySet()){
            System.out.println(i.getValue());
        }
    }
}

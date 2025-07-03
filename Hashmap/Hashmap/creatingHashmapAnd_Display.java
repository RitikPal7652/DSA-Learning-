package DSA.Hashmap.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class creatingHashmapAnd_Display {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        for(HashMap.Entry<String, Integer>  mp : map.entrySet()){
            String key = mp.getKey();
            Integer value = mp.getValue();
            System.out.println("Age of "+key+" is "+value);;
        }
    }
}

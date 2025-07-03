package DSA.Hashmap.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class maxFrequentElemen {
    public static void main(String[] args) {
        int[] arr = {10,20,10,20,30,20,20,20};
        HashMap<Integer, Integer> map=new HashMap<>();
        /*
        //Putting into the HashMap if key is not present in the Map.
        //and also if present in the Hashmap to increase its frequency
        //by 1.
        */

        for(Integer i : arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }
        //Display the newly formed HashMap.
        for(Map.Entry<Integer, Integer> i : map.entrySet());
        System.out.println(map);

        //To display maximum frequency of element.
        int maxFreq = -1;
        int ansKey = -1;

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println("The maxFrequent key is: "+ansKey);
    }
}

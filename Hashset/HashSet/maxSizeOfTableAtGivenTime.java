package DSA.Hashset.HashSet;

import java.util.HashSet;

public class maxSizeOfTableAtGivenTime {
    static int maxNumber(int[] bag){
        HashSet<Integer> table = new HashSet<>();
        int max = 0;

        for(int i=0; i<bag.length; i++){
            int num = bag[i];

            //TABLE IS CONSIDERED AS A SET.
            if(table.contains(num)){
                //Means, its pair is outside the bag.
                //So remove it from both the place from bag and from
                //the table also.
                table.remove(num);
            }
            else{
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,1,2,3,3};
        System.out.println(maxNumber(arr));
    }
}

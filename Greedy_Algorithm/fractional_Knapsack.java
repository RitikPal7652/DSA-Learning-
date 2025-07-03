package DSA.Greedy_Algorithm;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class fractional_Knapsack {
    public static class Item{
        int value;
        int weight;
        @Override
        public String toString(){
            return value+" "+weight;
        }
    }

    //For sorting from now onwards we use this comparator better choice.
    public static class itemComparator implements Comparator<Item>{
        //On descending order basis.
            public int compare(Item i1,Item i2){
                if((i1.value/i1.weight)<(i2.value/i2.weight))    return 1;
                else if((i1.value/i1.weight)>(i2.value/i2.weight))  return -1;
                else    return 0;
            }
    }
    public static void main(String[] args) {
//        List<Integer> value= List.of(60,100,150,120);
//        List<Integer> weight=List.of(10,20,50,15);

        List<Integer> value= List.of(60,100,120);
        List<Integer> weight=List.of(10,20,30);
        List<Item> itemList=new ArrayList<>();

        /*
        We need to find price v\s weight ratio so that we can check which has
        maximum ratio and on the basis we add in our sack. This is the reason
        we make item class in which we pair the  value and find ratio.
         */
        for(int i=0;i<value.size();i++){
            //Making an object
            Item item=new Item();
            item.value=value.get(i);
            item.weight=weight.get(i);

            itemList.add(item);

        }
        itemList.sort(new itemComparator());
        System.out.println(itemList);
        int W=50;
        int profit=0;
        //Now check whether sack can contains or we need to add fractional part.
        while(W>0){
            for(int i=0;i<itemList.size();i++){
                Item item = itemList.get(i);
                if(item.weight<=W){
                    profit+=item.value;
                    //120+60.
                    W-=item.weight;
                }
                else{
                    /*
                    By doing item.value/item.weight we can calculate for 1kg.
                    And multiply 1kg into their weight.

                    for adding fractional part into profit.
                     */
                    profit+=(item.value/item.weight)*W;
                    //120+60+25 (1/4th) of 100 bcz we done 1/4 of 20 also.
                    W=0;
                }
            }
            System.out.println(profit);
        }

    }
}

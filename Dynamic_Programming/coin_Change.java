package DSA.Dynamic_Programming;

import java.util.List;

public class coin_Change {
    static int calls=0;

    //start from last
    public static int coin_Problem(List<Integer> coins, int sum, int idx){
        calls++;
        //This is for 0th index only.
        if(idx==0){
            if(sum%coins.get(idx)==0){
                return 1;
            }else{
                return 0;
            }
        }
        //Now from 0th index onwards
        int pick=0;
        if(sum>=coins.get(idx))
            pick=coin_Problem(coins,sum-coins.get(idx),idx);
        int not_Pick=coin_Problem(coins,sum,idx-1);

        return pick+not_Pick;
    }

    //start from first
//    public static int coin(List<Integer> coin,int sum,int idx){
//
//        if(idx==coin.size()-1){
//            if(sum%coin.get(idx)==0){
//                return 1;
//            }else return 0;
//        }
//        calls++;
//        int pick=0;
//        if(sum>=coin.get(idx)){
//            pick=coin(coin,sum-coin.get(idx),idx);
//        }
//        int notPick=coin(coin,sum,idx+1);
//
//        return pick+notPick;
//    }
    public static void main(String[] args) {

        List<Integer> coins= List.of(2, 5, 3, 6);
        int sum=10;

        int ans=coin_Problem(coins,sum,0);
        System.out.println(ans);
        System.out.println(calls);
    }
}

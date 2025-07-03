package DSA.leetcodeProblems;

public class stockEasy {
    public static int maxProfit(int[] prices) {
        /*
        Assume each day as selling day if prices of today stock is greater than previous
        stock in which i had bought that stock means it is day of selling then maximise   your profit by (price of today - price of that day)

        But if the price of today's stock is less than that of previous day in which i had
        bought means it is not day of sell it is the day in which i can buy the stock.
        so just buy the stock and move ahead.
        */
        int n=prices.length;
        int bestBuy=prices[0];
        int maxProfit=0;

        for(int i=1;i<n;i++){
            //
            if(prices[i]>bestBuy){
                //Day of selling
                maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            }

            //if less price then buy it.
            bestBuy=Math.min(prices[i],bestBuy);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
}

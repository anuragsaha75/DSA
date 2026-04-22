public class BuySell_Stock {

    
    //MyCode with help of Anuj Kumar Sharma (https://youtu.be/34WE6kwq49U?si=PFE5QZLgWFxbaDvv)
    public static int MaxStockProfit(int prices[]){
        int buyingprice = prices[0];
        int maxprofit = 0;
        // Start from day 1 (since day 0 is already considered as initial buying price)
        for(int i=1;i<prices.length;i++){

            // Calculate profit if we sell on the current day
            int profit = prices[i]-buyingprice;

            // Update maximum profit if current profit is higher
            maxprofit = Math.max(profit, maxprofit);

        // Update buying price to the lowest price seen so far
        // This ensures we always buy at the cheapest price
            buyingprice = Math.min(buyingprice, prices[i]);
        }

        return maxprofit;
    }


    //Shradhha's Code
    public static int MaxStockProfit2(int prices[]){
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        // Traverse all days
        for(int i=0;i<prices.length;i++){
           // If current price is higher than buying price → we can sell today 
            if(buyingprice<prices[i]){
                // Calculate profit by selling today
                int profit = prices[i]-buyingprice;
                // Update max profit if this is the best so far
                maxprofit = Math.max(maxprofit, profit);
            } else{
                // If current price is lower → better day to buy
                // Update buying price
                buyingprice = prices[i];
            }
            
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int p = MaxStockProfit(arr);
        int s = MaxStockProfit2(arr);
        System.out.println(p);
        System.out.println(s);
    }

}

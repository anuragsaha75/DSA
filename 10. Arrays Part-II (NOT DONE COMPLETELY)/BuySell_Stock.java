public class BuySell_Stock {
    //MyCode with help of Anuj Kumar Sharma (https://youtu.be/34WE6kwq49U?si=PFE5QZLgWFxbaDvv)
    public static int MaxStockProfit(int prices[]){
        int buyingprice = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-buyingprice;
            maxprofit = Math.max(profit, maxprofit);
            buyingprice = Math.min(buyingprice, prices[i]);
        }
        return maxprofit;
    }


    //Shradhha's Code
    public static int MaxStockProfit2(int prices[]){
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            
            if(buyingprice<prices[i]){
                int profit = prices[i]-buyingprice;
                maxprofit = Math.max(maxprofit, profit);
            } else{
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

package lynn.easy;

/**
 * Created by liying on 2019/4/11.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int res=0;
        for (int i = 1; i < prices.length; i++) {
            res+=prices[i]-prices[i-1]>0?prices[i]-prices[i-1]:0;
        }
        return res;
    }

    public static void main(String[] args){
        BestTimetoBuyandSellStockII b=new BestTimetoBuyandSellStockII();
        int[] nums={7,1,5,3,6,4};
        System.out.println(b. maxProfit(nums));

    }

//    [7,1,5,3,6,4]
//    5
}

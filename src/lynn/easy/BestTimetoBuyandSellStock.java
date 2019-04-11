package lynn.easy;


/**
 * Created by liying on 2019/4/11.
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            //动态规划 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
            res=res<prices[i]-min?prices[i]-min:res;
            min=min<=prices[i]?min:prices[i];
        }
        return res;
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
        int[] nums = {2,1,4,5,2,9,7};
//        int[] nums = {7, 1, 5, 3, 6, 4};
//        int[] nums = {1,2,4};
//        int[] nums = {3,2,6,5,0,3};
//        int[] nums = {2,1,2,1,0,1,2};
//        int[] nums = {2,7,1,4,11};

        System.out.println(b.maxProfit(nums));

    }

//    [7,1,5,3,6,4]
//    [0,0,4,
//    5
}

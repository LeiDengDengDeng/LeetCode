package lynn.easy;

/**
 * Created by liying on 2019/4/22.
 */
public class ClimbStairs {
    /**
     * 递归超出时间限制
     *
     */
//    public int climbStairs(int n) {
//        if(n==1){
//            return 1;
//        }else if(n==2){
//            return 2;
//        }
//        return climbStairs(n-1)+climbStairs(n-2);
//    }

    /**
     *
     * 动态规划 dp[i]=dp[i−1]+dp[i−2]
     *
     */
    public int climbStairs(int n) {
        int[] dp=new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = 1;
            } else if (i == 1) {
                dp[i] = 2;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        ClimbStairs climbStairs= new ClimbStairs();
        System.out.println(climbStairs.climbStairs(44));
    }
}

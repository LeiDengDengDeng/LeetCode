package lynn.easy;

/**
 * Created by liying on 2019/4/22.
 */
public class Rob {

    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        for (int i = 1; i < n+1; i++) {
            if(i==1){
                dp[0]=0;
                dp[i]=nums[0];
            }else {
                dp[i] = dp[i - 2] + nums[i-1] > dp[i - 1] ? dp[i - 2] + nums[i-1] : dp[i - 1];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Rob r=new Rob();
        r.rob(new int[]{2,7,9,3,1});
    }
}

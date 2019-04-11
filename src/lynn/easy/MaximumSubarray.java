package lynn.easy;

import java.util.Arrays;

/**
 * Created by liying on 2019/4/11.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] res=new int[nums.length+1];
        res[0]=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + res[i] < 0) {
                res[i + 1] = 0;
            } else {
                res[i + 1] = nums[i] + res[i];
            }
        }
        if(Arrays.stream(res).max().getAsInt()==0){
            return  Arrays.stream(nums).max().getAsInt();
        }
        return Arrays.stream(res).max().getAsInt();
    }

//    [-2,1,-3,4,-1,2,1,-5,4]
//    6
//    [0,0,1 ,0,4,3,]

    public static void main(String[] args){
        MaximumSubarray m=new MaximumSubarray();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(m.maxSubArray(nums));

    }

}

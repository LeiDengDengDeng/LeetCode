package lynn.easy;

/**
 * Created by liying on 2018/5/30.
 */

import java.util.HashMap;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++) {
            map.put(target-nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            if(map.get(nums[j])!=null){
                int i=map.get(nums[j]);
                if(i!=j) {
                    res[0] = j;
                    res[1] = i;
                    break;
                }
            }
        }
        return res;

    }

    public static void main(String[] args){
//        int[] nums={1,2, 7, 11, 15};
//        int target=9;
        int[] nums={3,3};
        int target=6;
        TwoSum twoSum=new TwoSum();
        int[] res=twoSum.twoSum(nums,target);


    }

}

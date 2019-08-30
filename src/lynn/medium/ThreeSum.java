package lynn.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组
 * 链接：https://leetcode-cn.com/problems/3sum
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {//定义1位，寻找剩下2位
            while (i > 0 && nums[i] == nums[i - 1]) {
                if (i == nums.length - 2) {
                    return res;
                }
                i++;
            }
            int start = i + 1;// 2位下标从i+1开始
            int end = nums.length - 1;//3位下标从尾部开始 双向移动
            if (nums[i] * nums[end] > 0) {//如果三数同号直接返回
                return res;
            }
            while (start < end) {//直到start和end重复
                int sum = nums[start] + nums[end] + nums[i];
                if (sum == 0) {//如果相加=0就增加一条结果
                    List<Integer> seq = new ArrayList<>();
                    seq.add(nums[i]);
                    seq.add(nums[start]);
                    seq.add(nums[end]);
                    res.add(seq);
                    do {
                        start++;
                    }
                    while (start < end && start < nums.length - 1 && nums[start] == nums[start - 1]);
                    do {
                        end--;
                    }
                    while (start < end && end > 0 && nums[end] == nums[end + 1]);
                } else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }


    /**
     * 该算法可以算出所有sum=0的下标集合
     * <p>
     * public List<List<Integer>> threeSum(int[] nums) {
     * List<List<Integer>> res = new ArrayList<>();
     * for (int i = 0; i < nums.length; i++) {
     * List<List<Integer>> list = twoSum(nums, 0 - nums[i]);
     * for (int j = 0; j < list.size(); j++) {
     * List<Integer> seq = list.get(j);
     * if (seq.get(seq.size() - 1) < i) {
     * seq.add(i);
     * res.add(seq);
     * }
     * }
     * }
     * return res;
     * }
     * <p>
     * public List<List<Integer>> twoSum(int[] nums, int target) {
     * List<List<Integer>> res = new ArrayList<>();
     * HashMap<Integer, List<Integer>> map = new HashMap();
     * for (int i = 0; i < nums.length; i++) {
     * if (map.get(target - nums[i]) != null) {
     * map.get(target - nums[i]).add(i);
     * } else {
     * List<Integer> integers = new ArrayList<>();
     * integers.add(i);
     * map.put(target - nums[i], integers);
     * }
     * }
     * for (int i = 0; i < nums.length; i++) {
     * List<Integer> indexList = map.get(nums[i]);
     * if (indexList != null) {
     * for (Integer index : indexList) {
     * if (index < i) {
     * List<Integer> seq = new ArrayList<>();
     * seq.add(index);
     * seq.add(i);
     * res.add(seq);
     * }
     * }
     * }
     * }
     * return res;
     * }
     */

    public static void main(String[] args) {
        ThreeSum test = new ThreeSum();
//        List<List<Integer>> list = test.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> list = test.threeSum(new int[]{0, 0, 0});

        list.size();
    }


}

package deng.easy;

import java.util.*;

/**
 * @author deng
 * @date 2020/08/06
 */
public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return Collections.emptyList();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        // 提交后发现，BitSet节约了些许空间(58MB->50MB)，但耗时大幅提升(17ms->37ms)，BitSet效率没有想象中高
        int[] arrMap = new int[max - min + 1];
        // BitSet arrBitSet = new BitSet(max - min + 1);
        for (int i : arr) {
            // arrBitSet.set(i - min);
            arrMap[i - min] = 1;
        }


        List<List<Integer>> res = new ArrayList<>();
        int minAbsDiff = Integer.MAX_VALUE;
        int lastLoc = 0;
        // for (int i = 1; i < arrBitSet.size(); i++) {
        for (int i = 1; i < arrMap.length; i++) {
            // if (arrBitSet.get(i)) {
            if (arrMap[i] == 1) {
                if (minAbsDiff > i - lastLoc) {
                    minAbsDiff = i - lastLoc;

                    res.clear();
                    res.add(Arrays.asList(lastLoc + min, i + min));
                } else if (minAbsDiff == i - lastLoc) {
                    res.add(Arrays.asList(lastLoc + min, i + min));
                }

                lastLoc = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] input = {3, 8, -10, 23, 19, -4, -14, 27};
        new MinimumAbsDifference().minimumAbsDifference(input).forEach(l -> {
            l.forEach(i -> System.out.print(i + " "));
            System.out.println();
        });
    }
}

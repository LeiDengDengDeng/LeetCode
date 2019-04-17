package lynn.easy;

import java.util.Arrays;

/**
 * Created by liying on 2019/4/17.
 */
public class MergeSortedArray {

    /**
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * Output: [1,2,2,3,5,6]

     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        while(i>-1&&j>-1){
            if(nums1[i]<nums2[j]){
                nums1[i+j+1]=nums2[j];
                j--;
            }else{
                nums1[i+j+1]=nums1[i];
                i--;
            }
        }
        if(i<0){
            for (int k = 0; k < j+1; k++) {
                nums1[k]=nums2[k];
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
    public  static void main(String[] args){
        MergeSortedArray mergeSortedArray=new MergeSortedArray();
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        mergeSortedArray.merge(nums1,3,nums2,3);
    }
}

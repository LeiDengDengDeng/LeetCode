package lynn.medium;

/**
 * Created by liying on 2018/11/12.
 */
public class SearchinRotatedSortedArray {
    /**
     *假设按照升序排序的数组在预先未知的某个点上进行了旋转。

     *( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

     *搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

     *你可以假设数组中不存在重复的元素。

     *你的算法时间复杂度必须是 O(log n) 级别。
     *
     */
    public int search(int[] nums, int target) {
        if(nums.length==0){return -1;}
        return halfSearch(nums,target,0,nums.length-1);


    }

    public int halfSearch(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int head=nums[start];
        int rare=nums[end];
        if(target==head){
            return start;
        }
        if(target==rare){
            return end;
        }
        if(start==end){
            return -1;
        }
        int mid=nums[start+(end-start)/2];
        if(target==mid){
            return start+(end-start)/2;
        }
        //左边有序,右边可能逆转
        if(mid>rare){
            if(target<mid&&target>head){
                return sortedSearch(nums,target,start,start+(end-start)/2-1);
            }else {
                return halfSearch(nums,target,start+(end-start)/2,end-1);
            }
        }
        //右边有序，左边可能逆转
        else if(rare>mid){
            if(target>mid&&target<rare){
               return sortedSearch(nums,target,start+(end-start)/2,end-1);
            }else {
                return halfSearch(nums,target,start,start+(end-start)/2-1);
            }
        }
        return -1;

    }
    public int sortedSearch(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int head=nums[start];
        int rare=nums[end];
        if(target==head){
            return start;
        }
        if(target==rare){
            return end;
        }
        if(start==end){
            return -1;
        }

        int mid=nums[start+(end-start)/2];

        if(target==mid){
            return start+(end-start)/2;
        }

        if(target>rare||target<head){
            return -1;
        }

        if(target>mid){
            return sortedSearch(nums,target,start+(end-start)/2,end-1);
        }else if(target<mid){
            return sortedSearch(nums,target,start,start+(end-start)/2-1);
        }

        return -1;
    }

    public static void main(String[] args){
        SearchinRotatedSortedArray array=new SearchinRotatedSortedArray();
        int nums[]={6,7,8,1,2,3,4,5};
        System.out.println(array.search(nums,3));
    }

    /**
     * 如果中间的数小于最右边的数，则右半段是有序的，若中间数大于最右边数，则左半段是有序的s
     */

}

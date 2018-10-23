package lynn.easy;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int tail=digits.length-1;

        return plus(digits,tail);
    }
    private int[] plus(int[] digits, int point){
        if(point<0){
            return insert(digits);

        }else {
            if (digits[point] + 1 > 9) {
                digits[point] = 0;
                return plus(digits, point - 1);
            } else {
                digits[point] += 1;

            }
            return digits;
        }

    }

    private int[] insert(int [] digits){
        int[] res=new int[digits.length+1];
        for (int i=0;i<digits.length;i++){
            res[i+1]=digits[i];
        }
        res[0]=1;
        return res;
    }

    public static void main(String[] args){
        PlusOne one =new PlusOne();
        int[] num={9,9,9};
        System.out.println(Arrays.toString(one.plusOne(num)));
    }

}

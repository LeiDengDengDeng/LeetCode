package deng.easy;

/**
 * Created by deng on 2018/5/27.
 * https://leetcode-cn.com/problems/palindrome-number/description/
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Palindrome {
    public static void main(String[] args){
        System.out.println(new Palindrome().isPalindrome(-123));
        System.out.println(new Palindrome().isPalindrome(121));
        System.out.println(new Palindrome().isPalindrome(12321));
        System.out.println(new Palindrome().isPalindrome(123456));
        System.out.println(new Palindrome().isPalindrome(123321));
    }
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        for (int i = 0; i < (xStr.length() + 1) / 2; i++) {
            if (xStr.charAt(i) != xStr.charAt(xStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

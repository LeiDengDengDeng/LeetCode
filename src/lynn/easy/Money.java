package lynn.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by liying on 2019/4/20.
 */
public class Money {
    //    static long nums = 0;
//    static List<String> list = new ArrayList<>();
//
//    public static void main(String[] args) {
//        list.add("1");
//        list.add("5");
//        list.add("10");
//        list.add("20");
//        list.add("50");
//        list.add("100");
//        Scanner in=new Scanner(System.in);
//        calculate(in.nextInt());
//        System.out.println(nums);
//
//
//    }
//
//    static void calculate(int money) {
//        if (money == 0) {
//            nums += 1;
//            return;
//        }
//        for (int i = 0; i < list.size(); i++) {
//            String temp = list.get(i);
//            if(money<Integer.parseInt(temp)){
//                return;
//            }
//            List<String> removeList=new ArrayList<>();
//            for (int j = 0; j < i+1; j++) {
//                removeList.add(list.get(j));
//            }
//            list.removeAll(removeList);
//            for (int j = Integer.parseInt(temp); j <= money; j += Integer.parseInt(temp)) {
//                calculate(money - j);
//            }
//            list.addAll(0,removeList);
//        }
//
//    }

    public static void main(String[] args) {
        int[] kinds={0,1,5,10,20,50,100};
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long[][] matrix=new long[7][n+1];
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < n+1; j++) {
                if(j==kinds[i]){
                    matrix[i][j]=matrix[i-1][j]+1;
                } else if(j<kinds[i]){
                    matrix[i][j]=matrix[i-1][j];
                }else{
                    matrix[i][j]=matrix[i][j-kinds[i]]+matrix[i-1][j];
                }

            }
        }
        System.out.println(matrix[6][n]);

    }


}



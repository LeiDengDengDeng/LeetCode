package lynn.tencent;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/5.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int one=0;
        int zero=0;
        String[] str=in.next().split("");
        for (String i:str) {
            if(Integer.parseInt(i)==1){
                one++;
            }else if(Integer.parseInt(i)==0){
                zero++;
            }
        }
        System.out.println(Math.abs(one-zero));

    }


//    4
//            1100
}

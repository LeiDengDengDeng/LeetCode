package lynn.wy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by liying on 2019/4/7.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String[] split = n.split(",");
        String[] b = split[1].split("");
        String[] a = split[0].split("");
        int[] res=new int[a.length];
        int count=0;
        for (int i = 0; i < res.length; i++) {
            res[i]=0;
        }
//        List<String> listA = Arrays.asList(a);
//        List<String> listB = Arrays.asList(b);
        //去除可以不用动的位数
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b[i])) {
                res[i]=1;
            }
        }
        //统计可以交换的个数
        for (int i = 0; i < a.length; i++) {
            if (res[i]!=1) {
                for (int j = 0; j < a.length; j++) {
                    if(res[j]!=1&&a[i].equals(b[j])&&res[i]!=1){
                        String temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        res[j]=1;
                        count++;
                    }
                }
            }
        }
        int total=0;
        for (int i = 0; i < a.length; i++) {
            if(res[i]==0){
                total+=Math.abs(Integer.parseInt(a[i])-Integer.parseInt(b[i]));
            }
        }
        System.out.println(total+count);
    }

    //123,211
}

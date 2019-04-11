package lynn.wy;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by liying on 2019/4/7.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in. nextInt();
        HashMap hashMap=new HashMap(n);
        for (int i = 0; i < n; i++) {
            int num=in.nextInt();
            if(hashMap.containsKey(num)){
                int newv=(int)hashMap.get(num)+1;
                hashMap.replace(num,newv);
            }else{
                hashMap.put(num,1);
            }
        }
        System.out.println(hashMap.entrySet().size());
    }
//    11
//            60967004
//            56649743
//            56649743
//            56649743
//            47028890
//            28754231
//            29525293
//            52124230
//            18227202
//            38070752
//            52124230
}

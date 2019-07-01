package lynn.medium;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/22.
 * 击鼓传花
 */
public class JGCH {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        System.out.println(pass(1,m,n));
    }

    static int pass(int n,int m,int max){
        if(m==0){
            if(n==1) {
                return 1;
            }else{
                return 0;
            }
        }
        if(n==max){
            return pass(n-1,m-1,max)+pass(1,m-1,max);
        }else if(n==1){
            return pass(max,m-1,max)+pass(n+1,m-1,max);
        }else{
            return pass(n-1,m-1,max)+pass(n+1,m-1,max);
        }
    }
}

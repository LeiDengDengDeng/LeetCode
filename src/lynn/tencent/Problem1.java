package lynn.tencent;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/5.
 */
public class Problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[] kind=new int[n];
        for (int i = 0; i <n ; i++) {
            kind[i]=in.nextInt();
        }
        int[][] matrix=new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            matrix[i][0]=0;
        }
        for (int i = 0; i < m+1; i++) {
            matrix[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(kind[i-1]>j){
                    matrix[i][j]=-1;
                }else{
                    int min=0;
                    int b=matrix[i-1][j-kind[i-1]]+1;
                    int c=matrix[i][j-kind[i-1]]+1;
                    if(c>b){
                        min=b;
                    }else{
                        min=c;
                    }
                    if(matrix[i-1][j-kind[i-1]]==0){
                        min=c;
                    }
                    matrix[i][j]=min;
                }
            }

        }
        System.out.println(matrix[n][m]);
    }

//        20 4
//            1
//            2
//            5
//            10
    //输出：5


}

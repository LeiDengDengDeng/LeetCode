package lynn.jd;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/13.
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs=new String[n];
        for (int i = 0; i < n; i++) {
            strs[i]=in.next();
        }
        String T=in.next();
        String[] split=T.split("");
        int len=split.length;
        int[][] matrix=new int[n+1][len+1];
        for (int i = 0; i < n+1; i++) {
            matrix[i][0]=0;
        }
        for (int i = 0; i < len+1; i++) {
            matrix[0][i]=0;
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < len+1; j++) {
                int a=strs[i-1].length();
                if(j>=a&&T.substring(j-a,j).equals(strs[i-1])){
                    matrix[i][j]=matrix[i][j-split[i-1].length()]+1>matrix[i-1][j]?matrix[i][j-split[i-1].length()]+1:matrix[i-1][j];
                }else{
                    matrix[i][j]=matrix[i-1][j]>matrix[i][j-1]?matrix[i-1][j]:matrix[i][j-1];
                }
            }
        }
        System.out.println(matrix[n][len]);



    }

}

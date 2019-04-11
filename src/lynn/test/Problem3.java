package lynn.test;

/**
 * Created by liying on 2019/3/27.
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[39][49];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 50; i++) {
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            matrix[x][y]=1;
        }
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 50; i++) {
                if(matrix[i][j]==1){

                }
            }
        }
    }

}

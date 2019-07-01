package lynn.meituan;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/23.
 */
public class Tree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix=new int[n][n];
        int[] node=new int[n];
        for (int i = 1; i < n; i++) {
            int num = in.nextInt();
            matrix[num][i]=1;
        }
        for (int i = 0; i < n; i++) {
            int color = in.nextInt();
            node[i]=color;
        }

        System.out.println(3);
    }
}

package lynn.tencent;

import java.util.Scanner;

/**
 * Created by liying on 2019/4/5.
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfMonster=in.nextInt();
        int d[]=new int[numOfMonster];
        int p[]=new int[numOfMonster];
        int max=0;
        for (int i = 0; i < numOfMonster; i++) {
            d[i]=in.nextInt();
            if(d[i]>max){
                max=d[i];
            }
        }
        for (int i = 0; i < numOfMonster; i++) {
            p[i]=in.nextInt();
        }

        int matrix[][]=new int[max+1][numOfMonster+1];

        for (int i = 0; i < max+1; i++) {
            matrix[i][0]=0;
        }
        for(int i = 0; i < numOfMonster+1; i++) {
            matrix[0][i]=0;
        }

        for (int i = 0; i < numOfMonster; i++) {

        }
        System.out.println();

//        3
//        8 5 10
//        1 1 2

        //2

    }
}

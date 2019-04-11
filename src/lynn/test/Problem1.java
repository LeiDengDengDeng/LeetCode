package lynn.test;
import java.util.Scanner;
/**
 * Created by liying on 2019/3/27.
 */
public class Problem1 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
            String s=in.next();
            String res="";
            for (int i=0;i<n;i++){
                int type=Integer.parseInt(s.substring(i*9,i*9+1));
                String temp=s.substring(i*9+1,i*9+9);
                if(type==0){
                    String[] chs=temp.split("");
                    for (int j=0;j<8;j++){
                        res+=chs[7-j];
                    }

                }else if(type==1){
                    res+=temp;
                }
                if(i<n-1){
                    res+=" ";
                }
            }
            System.out.println(res);

        }

        //输入
        // 2
        // 0abcdefgh1abcdefgh
}

package lynn.meituan;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by liying on 2019/4/23.
 */
public class ModifyMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        HashMap<Integer, Integer> odd = new HashMap<>(n * m / 2);
        HashMap<Integer, Integer> even = new HashMap<>(n * m / 2);
        int oddNums;
        if (n * m % 2 == 1) {
            oddNums = n * m / 2 + 1;
        } else {
            oddNums = n * m / 2;
        }
        int evenNums = n * m / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = in.nextInt();
                if ((i + j) % 2 == 0) {
                    if (odd.get(num) == null) {
                        odd.put(num, 1);
                    } else {
                        odd.put(num, odd.get(num) + 1);
                    }
                } else {
                    if (even.get(num) == null) {
                        even.put(num, 1);
                    } else {
                        even.put(num, even.get(num) + 1);
                    }
                }

            }
        }
        int res = 0;
        Map.Entry<Integer, Integer> oddEntry = odd.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
        Map.Entry<Integer, Integer> evenEntry = even.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
        if (oddEntry.getKey().equals(evenEntry.getKey())) {
            if (oddEntry.getValue() >= evenEntry.getValue()) {
                even.remove(evenEntry.getKey());
                if (!even.isEmpty()) {
                    evenEntry = even.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
                    res = evenNums - evenEntry.getValue();
                } else {
                    res = evenEntry.getValue();
                }
            } else {
                odd.remove(oddEntry.getKey());
                oddEntry = odd.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get();
                res = oddNums - oddEntry.getValue();
            }
        }else{
            res=oddNums-oddEntry.getValue()+evenNums-evenEntry.getValue();
        }
        System.out.println(res);
    }

}

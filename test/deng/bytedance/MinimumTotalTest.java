package deng.bytedance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/10/15
 */
public class MinimumTotalTest {

    @Test
    public void minimumTotal() {
        List<Integer> line1 = Stream.of(2).collect(Collectors.toList());
        List<Integer> line2 = Stream.of(3,4).collect(Collectors.toList());
        List<Integer> line3 = Stream.of(6,5,7).collect(Collectors.toList());
        List<Integer> line4 = Stream.of(4,1,8,3).collect(Collectors.toList());

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(line1);
        triangle.add(line2);
        triangle.add(line3);
        triangle.add(line4);

        assertEquals(11,new MinimumTotal().minimumTotal(triangle));
    }
}
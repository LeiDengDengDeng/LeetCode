package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/8.
 */
public class PermuteUniqueTest {
    @Test
    public void permuteUnique() throws Exception {
        PermuteUnique permuteUnique = new PermuteUnique();
        System.out.println(permuteUnique.permuteUnique(new int[]{1, 1, 2, 2}));
        System.out.println(permuteUnique.permuteUnique(new int[]{-1, 2, -1, 2, 1, -1, 2, 1}));
    }

}
package deng.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2020/01/20
 */
public class FindDuplicateFileInSystemTest {

    @Test
    public void findDuplicate() {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};

        List<List<String>> res = new FindDuplicateFileInSystem().findDuplicate(paths);

        assertEquals(2, res.size());
    }
}
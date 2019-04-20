package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/20
 */
public class RestoreIPAddressesTest {
    @Test
    public void restoreIpAddresses1() {
        assertTrue(new RestoreIPAddresses().restoreIpAddresses("25525511135").size() == 2);
    }

    @Test
    public void restoreIpAddresses2() {
        assertTrue((new RestoreIPAddresses().restoreIpAddresses("0000")).size() == 1);
    }

    @Test
    public void restoreIpAddresses3() {
        assertTrue(new RestoreIPAddresses().restoreIpAddresses("010010").size() == 2);
    }
}
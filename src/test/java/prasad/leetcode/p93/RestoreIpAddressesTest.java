package prasad.leetcode.p93;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RestoreIpAddressesTest {

    @Test
    public void test25525511135() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("25525511135");
        Assert.assertEquals(2, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("255.255.11.135"));
        Assert.assertTrue(ipAddresses.contains("255.255.111.35"));
    }

    @Test
    public void test1234() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("1234");
        Assert.assertEquals(1, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("1.2.3.4"));
    }

    @Test
    public void test0000() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("0000");
        Assert.assertEquals(1, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("0.0.0.0"));
    }

    @Test
    public void test1111() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("1111");
        Assert.assertEquals(1, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("1.1.1.1"));
    }

    @Test
    public void test010010() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("010010");
        Assert.assertEquals(2, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("0.10.0.10"));
        Assert.assertTrue(ipAddresses.contains("0.100.1.0"));
    }

    @Test
    public void test101023() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("101023");
        Assert.assertEquals(5, ipAddresses.size());
        Assert.assertTrue(ipAddresses.contains("1.0.10.23"));
        Assert.assertTrue(ipAddresses.contains("1.0.102.3"));
        Assert.assertTrue(ipAddresses.contains("10.1.0.23"));
        Assert.assertTrue(ipAddresses.contains("10.10.2.3"));
        Assert.assertTrue(ipAddresses.contains("101.0.2.3"));
    }

    @Test
    public void testTooShort() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("123");
        Assert.assertTrue(ipAddresses.isEmpty());
    }

    @Test
    public void testTooLong() {
        List<String> ipAddresses = new RestoreIpAddresses().restoreIpAddresses("1234567890123");
        Assert.assertTrue(ipAddresses.isEmpty());
    }
}

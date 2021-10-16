package prasad.leetcode.p811;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SubdomainVisitCountTest {

    @Test
    public void test01() {
        List<String> result = new SubdomainVisitCount().subdomainVisits(new String[] {"9001 discuss.leetcode.com"});
        Assert.assertEquals(3, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("9001 leetcode.com", "9001 discuss.leetcode.com", "9001 com")));
    }

    @Test
    public void test02() {
        List<String> result = new SubdomainVisitCount().subdomainVisits(new String[] {
                "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        Assert.assertEquals(7, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("901 mail.com", "50 yahoo.com", "900 google.mail.com",
                "5 wiki.org", "5 org", "1 intel.mail.com", "951 com")));
    }

    @Test
    public void test03() {
        List<String> result = new SubdomainVisitCount().subdomainVisits(new String[] {"40 leetcode.com"});
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.containsAll(Arrays.asList("40 leetcode.com", "40 com")));
    }
}

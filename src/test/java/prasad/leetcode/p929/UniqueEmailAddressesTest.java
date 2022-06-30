package prasad.leetcode.p929;

import org.junit.Assert;
import org.junit.Test;

public class UniqueEmailAddressesTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new UniqueEmailAddresses().numUniqueEmails(new String[] {
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new UniqueEmailAddresses().numUniqueEmails(new String[] {
                "a@leetcode.com",
                "b@leetcode.com",
                "c@leetcode.com"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(3, new UniqueEmailAddresses().numUniqueEmails(new String[] {
                "a.b+pqr@leetcode.com",
                "ab+xyz@leetcode.com",
                "ab@leet.code.com",
                "ab@leet.code+pq.com",
                "ab+x.y.z@leetcode.com"}));
    }
}

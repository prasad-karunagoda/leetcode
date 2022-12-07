package prasad.leetcode.p1797;

import org.junit.Assert;
import org.junit.Test;

public class DesignAuthenticationManagerTest {

    @Test
    public void test01() {
        DesignAuthenticationManager authenticationManager = new DesignAuthenticationManager(5);
        authenticationManager.renew("aaa", 1);
        authenticationManager.generate("aaa", 2);
        Assert.assertEquals(1, authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("bbb", 7);
        authenticationManager.renew("aaa", 8);
        authenticationManager.renew("bbb", 10);
        Assert.assertEquals(1, authenticationManager.countUnexpiredTokens(14));
        Assert.assertEquals(0, authenticationManager.countUnexpiredTokens(15));
    }

    @Test
    public void test02() {
        DesignAuthenticationManager authenticationManager = new DesignAuthenticationManager(5);
        authenticationManager.generate("aaa", 2);
        authenticationManager.generate("bbb", 3);
        authenticationManager.generate("ccc", 5);
        Assert.assertEquals(3, authenticationManager.countUnexpiredTokens(6));
        Assert.assertEquals(2, authenticationManager.countUnexpiredTokens(7));
        authenticationManager.renew("bbb", 7);
        authenticationManager.generate("ddd", 8);
        Assert.assertEquals(3, authenticationManager.countUnexpiredTokens(9));
        Assert.assertEquals(2, authenticationManager.countUnexpiredTokens(10));
        Assert.assertEquals(2, authenticationManager.countUnexpiredTokens(11));
        Assert.assertEquals(1, authenticationManager.countUnexpiredTokens(12));
    }
}

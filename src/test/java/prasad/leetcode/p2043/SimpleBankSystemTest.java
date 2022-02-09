package prasad.leetcode.p2043;

import org.junit.Assert;
import org.junit.Test;

public class SimpleBankSystemTest {

    @Test
    public void test01() {
        SimpleBankSystem bankSystem = new SimpleBankSystem(new long[] {10, 100, 20, 50, 30});
        Assert.assertTrue(bankSystem.withdraw(3, 10));
        Assert.assertTrue(bankSystem.transfer(5, 1, 20));
        Assert.assertTrue(bankSystem.deposit(5, 20));
        Assert.assertFalse(bankSystem.transfer(3, 4, 15));
        Assert.assertFalse(bankSystem.withdraw(10, 50));
    }

    @Test
    public void test02() {
        SimpleBankSystem bankSystem = new SimpleBankSystem(new long[] {100});
        Assert.assertTrue(bankSystem.transfer(1, 1, 20));
    }
}

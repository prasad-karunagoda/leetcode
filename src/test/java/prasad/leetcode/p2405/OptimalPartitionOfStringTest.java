package prasad.leetcode.p2405;

import org.junit.Assert;
import org.junit.Test;

public class OptimalPartitionOfStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new OptimalPartitionOfString().partitionString("abacaba"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(6, new OptimalPartitionOfString().partitionString("ssssss"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new OptimalPartitionOfString().partitionString("k"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(6, new OptimalPartitionOfString().partitionString("aaabbbaa"));
    }
}

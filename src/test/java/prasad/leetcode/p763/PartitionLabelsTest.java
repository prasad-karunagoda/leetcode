package prasad.leetcode.p763;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class PartitionLabelsTest {

    @Test
    public void test01() {
        Assert.assertEquals(Arrays.asList(9, 7, 8),
                new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(Collections.singletonList(10),
                new PartitionLabels().partitionLabels("eccbbbbdec"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(Collections.singletonList(1),
                new PartitionLabels().partitionLabels("k"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(Arrays.asList(1, 1),
                new PartitionLabels().partitionLabels("bk"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(Arrays.asList(1, 9),
                new PartitionLabels().partitionLabels("gtywtbcnow"));
    }
}

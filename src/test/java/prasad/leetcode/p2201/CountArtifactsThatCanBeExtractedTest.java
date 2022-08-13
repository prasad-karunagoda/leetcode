package prasad.leetcode.p2201;

import org.junit.Assert;
import org.junit.Test;

public class CountArtifactsThatCanBeExtractedTest {

    @Test
    public void test01() {
        int count = new CountArtifactsThatCanBeExtracted().digArtifacts(2,
                new int[][] {{0,0,0,0},{0,1,1,1}},
                new int[][] {{0,0},{0,1}});
        Assert.assertEquals(1, count);
    }

    @Test
    public void test02() {
        int count = new CountArtifactsThatCanBeExtracted().digArtifacts(2,
                new int[][] {{0,0,0,0},{0,1,1,1}},
                new int[][] {{0,0},{0,1},{1,1}});
        Assert.assertEquals(2, count);
    }

    @Test
    public void test03() {
        int count = new CountArtifactsThatCanBeExtracted().digArtifacts(1,
                new int[][] {{0,0,0,0}},
                new int[][] {{0,0}});
        Assert.assertEquals(1, count);
    }
}

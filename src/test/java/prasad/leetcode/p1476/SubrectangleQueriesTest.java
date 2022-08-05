package prasad.leetcode.p1476;

import org.junit.Assert;
import org.junit.Test;

public class SubrectangleQueriesTest {

    @Test
    public void test01() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][] {
                {1,2,1},
                {4,3,4},
                {3,2,1},
                {1,1,1}});
        Assert.assertEquals(1, subrectangleQueries.getValue(0, 2));
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        Assert.assertEquals(5, subrectangleQueries.getValue(0, 2));
        Assert.assertEquals(5, subrectangleQueries.getValue(3, 1));
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        Assert.assertEquals(10, subrectangleQueries.getValue(3, 1));
        Assert.assertEquals(5, subrectangleQueries.getValue(0, 2));
    }

    @Test
    public void test02() {
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(new int[][] {
                {1,1,1},
                {2,2,2},
                {3,3,3}});
        Assert.assertEquals(1, subrectangleQueries.getValue(0, 0));
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        Assert.assertEquals(100, subrectangleQueries.getValue(0, 0));
        Assert.assertEquals(100, subrectangleQueries.getValue(2, 2));
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        Assert.assertEquals(20, subrectangleQueries.getValue(2, 2));
    }
}

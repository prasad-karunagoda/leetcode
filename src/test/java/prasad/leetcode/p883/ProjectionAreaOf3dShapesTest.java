package prasad.leetcode.p883;

import org.junit.Assert;
import org.junit.Test;

public class ProjectionAreaOf3dShapesTest {

    @Test
    public void test01() {
        Assert.assertEquals(17, new ProjectionAreaOf3dShapes().projectionArea(new int[][] {{1,2}, {3,4}}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new ProjectionAreaOf3dShapes().projectionArea(new int[][] {{2}}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(8, new ProjectionAreaOf3dShapes().projectionArea(new int[][] {{1,0}, {0,2}}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new ProjectionAreaOf3dShapes().projectionArea(new int[][] {{0,0}, {0,0}}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(5, new ProjectionAreaOf3dShapes().projectionArea(
                new int[][] {{0,1,0}, {0,1,0}, {0,0,0}}));
    }
}

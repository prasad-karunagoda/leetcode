package prasad.leetcode.p2079;

import org.junit.Assert;
import org.junit.Test;

public class WateringPlantsTest {

    @Test
    public void test01() {
        Assert.assertEquals(14, new WateringPlants().wateringPlants(new int[] {2,2,3,3}, 5));
    }

    @Test
    public void test02() {
        Assert.assertEquals(30, new WateringPlants().wateringPlants(new int[] {1,1,1,4,2,3}, 4));
    }

    @Test
    public void test03() {
        Assert.assertEquals(49, new WateringPlants().wateringPlants(new int[] {7,7,7,7,7,7,7}, 8));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new WateringPlants().wateringPlants(new int[] {5}, 6));
    }

    @Test
    public void test05() {
        Assert.assertEquals(4, new WateringPlants().wateringPlants(new int[] {5,3}, 6));
    }
}

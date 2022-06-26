package prasad.leetcode.p1333;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class FilterRestaurantsTest {

    private static final int[][] RESTAURANTS = new int[][] {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,1,1,15,1}};

    @Test
    public void test01() {
        Assert.assertEquals(Arrays.asList(3,1,5), new FilterRestaurants().filterRestaurants(
                RESTAURANTS,
                1, 50, 10));
    }

    @Test
    public void test02() {
        Assert.assertEquals(Arrays.asList(4,3,2,1,5), new FilterRestaurants().filterRestaurants(
                RESTAURANTS,
                0, 50, 10));
    }

    @Test
    public void test03() {
        Assert.assertEquals(Arrays.asList(4,5), new FilterRestaurants().filterRestaurants(
                RESTAURANTS,
                0, 30, 3));
    }

    @Test
    public void test04() {
        // Only change in RESTAURANTS: res5.rating -> 10
        Assert.assertEquals(Arrays.asList(5,4), new FilterRestaurants().filterRestaurants(
                new int[][] {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,4},{4,10,0,10,3},{5,10,1,15,1}},
                0, 30, 3));
    }

    @Test
    public void test05() {
        // Only change in RESTAURANTS: res3.distance -> 3
        Assert.assertEquals(Arrays.asList(4,3,5), new FilterRestaurants().filterRestaurants(
                new int[][] {{1,4,1,40,10},{2,8,0,50,5},{3,8,1,30,3},{4,10,0,10,3},{5,1,1,15,1}},
                0, 30, 3));
    }

    @Test
    public void test06() {
        Assert.assertEquals(Collections.emptyList(), new FilterRestaurants().filterRestaurants(
                new int[][] {{1,4,1,40,2}},
                1, 30, 3));
    }
}

package prasad.leetcode.p677;

import org.junit.Assert;
import org.junit.Test;

public class MapSumPairsTest {

    @Test
    public void test01() {
        MapSumPairs mapSumPairs = new MapSumPairs();
        mapSumPairs.insert("apple", 3);
        Assert.assertEquals(3, mapSumPairs.sum("ap"));
        mapSumPairs.insert("app", 2);
        Assert.assertEquals(5, mapSumPairs.sum("ap"));
    }

    @Test
    public void test02() {
        MapSumPairs mapSumPairs = new MapSumPairs();
        Assert.assertEquals(0, mapSumPairs.sum("ap"));
    }

    @Test
    public void test03() {
        MapSumPairs mapSumPairs = new MapSumPairs();
        mapSumPairs.insert("apple", 3);
        mapSumPairs.insert("apple", 5);
        mapSumPairs.insert("apple", 7);
        mapSumPairs.insert("apple", 4);
        Assert.assertEquals(4, mapSumPairs.sum("ap"));
    }

    @Test
    public void test04() {
        MapSumPairs mapSumPairs = new MapSumPairs();
        mapSumPairs.insert("apple", 3);
        mapSumPairs.insert("app", 5);
        Assert.assertEquals(8, mapSumPairs.sum("app"));
    }
}

package prasad.leetcode.p1470;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleArrayTest {

    @Test
    public void test01() {
        int[] shuffled = new ShuffleArray().shuffle(new int[] {2,5,1,3,4,7}, 3);
        Assert.assertArrayEquals(new int[] {2,3,5,4,1,7}, shuffled);
    }

    @Test
    public void test02() {
        int[] shuffled = new ShuffleArray().shuffle(new int[] {1,2,3,4,4,3,2,1}, 4);
        Assert.assertArrayEquals(new int[] {1,4,2,3,3,2,4,1}, shuffled);
    }

    @Test
    public void test03() {
        int[] shuffled = new ShuffleArray().shuffle(new int[] {1,1,2,2}, 2);
        Assert.assertArrayEquals(new int[] {1,2,1,2}, shuffled);
    }

    @Test
    public void test04() {
        int[] shuffled = new ShuffleArray().shuffle(new int[] {5,6}, 1);
        Assert.assertArrayEquals(new int[] {5,6}, shuffled);
    }
}

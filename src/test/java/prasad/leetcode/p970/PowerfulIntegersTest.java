package prasad.leetcode.p970;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PowerfulIntegersTest {

    @Test
    public void test01() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(2, 3, 10);
        Assert.assertEquals(new HashSet<>(Arrays.asList(2,3,4,5,7,9,10)), new HashSet<>(list));
    }

    @Test
    public void test02() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(3, 5, 15);
        Assert.assertEquals(new HashSet<>(Arrays.asList(2,4,6,8,10,14)), new HashSet<>(list));
    }

    @Test
    public void test03() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(1, 1, 0);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void test04() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(7, 4, 19);
        Assert.assertEquals(new HashSet<>(Arrays.asList(2,8,5,11,17)), new HashSet<>(list));
    }

    @Test
    public void test05() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(1, 1, 3);
        Assert.assertEquals(Collections.singleton(2), new HashSet<>(list));
    }

    @Test
    public void test06() {
        List<Integer> list = new PowerfulIntegers().powerfulIntegers(1, 2, 3);
        Assert.assertEquals(new HashSet<>(Arrays.asList(2,3)), new HashSet<>(list));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new PowerfulIntegers().powerfulIntegers(3, 2, 1000000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}

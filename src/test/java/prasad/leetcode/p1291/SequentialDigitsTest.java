package prasad.leetcode.p1291;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class SequentialDigitsTest {

    @Test
    public void test01() {
        Assert.assertEquals(Arrays.asList(123,234), new SequentialDigits().sequentialDigits(100, 300));
    }

    @Test
    public void test02() {
        Assert.assertEquals(Arrays.asList(1234,2345,3456,4567,5678,6789,12345),
                new SequentialDigits().sequentialDigits(1000, 13000));
    }

    @Test
    public void test03() {
        Assert.assertEquals(Arrays.asList(12,23,34,45,56,67,78,89,
                        123,234,345,456,567,678,789,
                        1234,2345,3456,4567,5678,6789,
                        12345,23456,34567,45678,56789,
                        123456,234567,345678,456789,
                        1234567,2345678,3456789,
                        12345678,23456789,
                        123456789),
                new SequentialDigits().sequentialDigits(10, 1_000_000_000));
    }

    @Test
    public void test04() {
        Assert.assertEquals(Collections.emptyList(), new SequentialDigits().sequentialDigits(10, 11));
    }

    @Test
    public void test05() {
        Assert.assertEquals(Collections.emptyList(), new SequentialDigits().sequentialDigits(200_000_000, 300_000_000));
    }

    @Test
    public void test06() {
        Assert.assertEquals(Arrays.asList(234,345,456), new SequentialDigits().sequentialDigits(234, 456));
    }
}

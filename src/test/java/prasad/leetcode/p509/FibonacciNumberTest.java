package prasad.leetcode.p509;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    @Test
    public void test0() {
        Assert.assertEquals(0, new FibonacciNumber().fib(0));
    }

    @Test
    public void test1() {
        Assert.assertEquals(1, new FibonacciNumber().fib(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, new FibonacciNumber().fib(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, new FibonacciNumber().fib(3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(3, new FibonacciNumber().fib(4));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, new FibonacciNumber().fib(5));
    }

    @Test
    public void test6() {
        Assert.assertEquals(8, new FibonacciNumber().fib(6));
    }
}

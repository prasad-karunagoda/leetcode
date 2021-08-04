package prasad.leetcode.p412;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FizzBuzzTest {

    @Test
    public void test1() {
        List<String> answer = new FizzBuzz().fizzBuzz(1);
        Assert.assertEquals(Collections.singletonList("1"), answer);
    }

    @Test
    public void test3() {
        List<String> answer = new FizzBuzz().fizzBuzz(3);
        Assert.assertEquals(Arrays.asList("1","2","Fizz"), answer);
    }

    @Test
    public void test5() {
        List<String> answer = new FizzBuzz().fizzBuzz(5);
        Assert.assertEquals(Arrays.asList("1","2","Fizz","4","Buzz"), answer);
    }

    @Test
    public void test15() {
        List<String> answer = new FizzBuzz().fizzBuzz(15);
        Assert.assertEquals(Arrays.asList(
                "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), answer);
    }

    @Test
    public void test17() {
        List<String> answer = new FizzBuzz().fizzBuzz(17);
        Assert.assertEquals(Arrays.asList(
                "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16","17"), answer);
    }
}

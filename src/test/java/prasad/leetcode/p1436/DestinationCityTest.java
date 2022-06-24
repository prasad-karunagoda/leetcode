package prasad.leetcode.p1436;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class DestinationCityTest {

    @Test
    public void test01() {
        Assert.assertEquals("Sao Paulo", new DestinationCity().destCity(Arrays.asList(
                Arrays.asList("London","New York"),
                Arrays.asList("New York","Lima"),
                Arrays.asList("Lima","Sao Paulo"))));
    }

    @Test
    public void test02() {
        Assert.assertEquals("A", new DestinationCity().destCity(Arrays.asList(
                Arrays.asList("B","C"),
                Arrays.asList("D","B"),
                Arrays.asList("C","A"))));
    }

    @Test
    public void test03() {
        Assert.assertEquals("Z", new DestinationCity().destCity(Collections.singletonList(
                Arrays.asList("A","Z"))));
    }
}

package prasad.leetcode.p1441;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BuildArrayWithStackOperationsTest {

    @Test
    public void test01() {
        List<String> operations = new BuildArrayWithStackOperations().buildArray(new int[] {1, 3}, 3);
        Assert.assertEquals(Arrays.asList("Push", "Push", "Pop", "Push"), operations);
    }

    @Test
    public void test02() {
        List<String> operations = new BuildArrayWithStackOperations().buildArray(new int[] {1, 2, 3}, 3);
        Assert.assertEquals(Arrays.asList("Push", "Push", "Push"), operations);
    }

    @Test
    public void test03() {
        List<String> operations = new BuildArrayWithStackOperations().buildArray(new int[] {1, 2}, 4);
        Assert.assertEquals(Arrays.asList("Push", "Push"), operations);
    }
}

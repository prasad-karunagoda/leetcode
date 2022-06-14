package prasad.leetcode.p1630;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarraysTest {

    @Test
    public void test01() {
        List<Boolean> result = new ArithmeticSubarrays().checkArithmeticSubarrays(
                new int[] {4,6,5,9,3,7}, new int[] {0,0,2}, new int[] {2,3,5});
        Assert.assertEquals(Arrays.asList(true,false,true), result);
    }

    @Test
    public void test02() {
        List<Boolean> result = new ArithmeticSubarrays().checkArithmeticSubarrays(
                new int[] {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10}, new int[] {0,1,6,4,8,7}, new int[] {4,4,9,7,9,10});
        Assert.assertEquals(Arrays.asList(false,true,false,false,true,true), result);
    }

    @Test
    public void test03() {
        List<Boolean> result = new ArithmeticSubarrays().checkArithmeticSubarrays(
                new int[] {3,5}, new int[] {0}, new int[] {1});
        Assert.assertEquals(Collections.singletonList(true), result);
    }
}

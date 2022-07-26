package prasad.leetcode.p2120;

import org.junit.Assert;
import org.junit.Test;

public class ExecutionOfAllSuffixInstructionsTest {

    @Test
    public void test01() {
        int[] result = new ExecutionOfAllSuffixInstructions().executeInstructions(3, new int[] {0,1}, "RRDDLU");
        Assert.assertArrayEquals(new int[] {1,5,4,3,1,0}, result);
    }

    @Test
    public void test02() {
        int[] result = new ExecutionOfAllSuffixInstructions().executeInstructions(2, new int[] {1,1}, "LURD");
        Assert.assertArrayEquals(new int[] {4,1,0,0}, result);
    }

    @Test
    public void test03() {
        int[] result = new ExecutionOfAllSuffixInstructions().executeInstructions(1, new int[] {0,0}, "LRUD");
        Assert.assertArrayEquals(new int[] {0,0,0,0}, result);
    }
}

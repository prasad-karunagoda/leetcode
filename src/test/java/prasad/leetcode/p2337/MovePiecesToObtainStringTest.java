package prasad.leetcode.p2337;

import org.junit.Assert;
import org.junit.Test;

public class MovePiecesToObtainStringTest {

    @Test
    public void test01() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("_L__R__R_", "L______RR"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new MovePiecesToObtainString().canChange("R_L_", "__LR"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new MovePiecesToObtainString().canChange("_R", "R_"));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("R_R_LR__LLR_L", "_R_RLRL_LRL_"));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("_", "_"));
    }

    @Test
    public void test06() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("R", "R"));
    }

    @Test
    public void test07() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("L", "L"));
    }

    @Test
    public void test08() {
        Assert.assertTrue(new MovePiecesToObtainString().canChange("RRLRLRLLRLR", "RRLRLRLLRLR"));
    }
}

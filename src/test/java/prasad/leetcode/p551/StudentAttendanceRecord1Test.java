package prasad.leetcode.p551;

import org.junit.Assert;
import org.junit.Test;

public class StudentAttendanceRecord1Test {

    @Test
    public void test01() {
        Assert.assertTrue(new StudentAttendanceRecord1().checkRecord("PPALLP"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new StudentAttendanceRecord1().checkRecord("PPALLL"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new StudentAttendanceRecord1().checkRecord("PAPALLP"));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new StudentAttendanceRecord1().checkRecord("PPALLPA"));
    }

    @Test
    public void test05() {
        Assert.assertFalse(new StudentAttendanceRecord1().checkRecord("LLLPPALL"));
    }
}

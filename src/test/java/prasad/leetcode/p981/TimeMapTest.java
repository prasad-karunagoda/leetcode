package prasad.leetcode.p981;

import org.junit.Assert;
import org.junit.Test;

public class TimeMapTest {

    @Test
    public void test01() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 2);
        Assert.assertEquals("bar", timeMap.get("foo", 2));
        Assert.assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        Assert.assertEquals("bar2", timeMap.get("foo", 4));
        Assert.assertEquals("bar2", timeMap.get("foo", 5));
        Assert.assertEquals("bar", timeMap.get("foo", 3));
        Assert.assertEquals("", timeMap.get("foo2", 3));
        Assert.assertEquals("", timeMap.get("foo", 1));
    }
}

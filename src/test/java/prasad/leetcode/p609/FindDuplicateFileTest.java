package prasad.leetcode.p609;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateFileTest {

    @Test
    public void test01() {
        String[] paths = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        List<List<String>> result = new FindDuplicateFile().findDuplicate(paths);
        Assert.assertEquals(2, result.size());
        Set<String> expected1 = new HashSet<>(Arrays.asList("root/a/2.txt","root/c/d/4.txt","root/4.txt"));
        Set<String> expected2 = new HashSet<>(Arrays.asList("root/a/1.txt","root/c/3.txt"));
        Set<String> actual1 = new HashSet<>(result.get(0));
        Set<String> actual2 = new HashSet<>(result.get(1));
        Assert.assertTrue(expected1.equals(actual1) || expected1.equals(actual2));
        Assert.assertTrue(expected2.equals(actual1) || expected2.equals(actual2));
    }

    @Test
    public void test02() {
        String[] paths = new String[] {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)"};
        List<List<String>> result = new FindDuplicateFile().findDuplicate(paths);
        Assert.assertEquals(2, result.size());
        Set<String> expected1 = new HashSet<>(Arrays.asList("root/a/2.txt","root/c/d/4.txt"));
        Set<String> expected2 = new HashSet<>(Arrays.asList("root/a/1.txt","root/c/3.txt"));
        Set<String> actual1 = new HashSet<>(result.get(0));
        Set<String> actual2 = new HashSet<>(result.get(1));
        Assert.assertTrue(expected1.equals(actual1) || expected1.equals(actual2));
        Assert.assertTrue(expected2.equals(actual1) || expected2.equals(actual2));
    }

    @Test
    public void test03() {
        String[] paths = new String[] {"root/a 1.txt(abcd)"};
        List<List<String>> result = new FindDuplicateFile().findDuplicate(paths);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test04() {
        String[] paths = new String[] {"root/a"};
        List<List<String>> result = new FindDuplicateFile().findDuplicate(paths);
        Assert.assertEquals(0, result.size());
    }
}

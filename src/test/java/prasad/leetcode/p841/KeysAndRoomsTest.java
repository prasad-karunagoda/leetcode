package prasad.leetcode.p841;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KeysAndRoomsTest {

    @Test
    public void test01() {
        List<List<Integer>> rooms = Arrays.asList(
                Collections.singletonList(1),
                Collections.singletonList(2),
                Collections.singletonList(3),
                Collections.emptyList());
        Assert.assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }

    @Test
    public void test02() {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Collections.singletonList(2),
                Collections.singletonList(0));
        Assert.assertFalse(new KeysAndRooms().canVisitAllRooms(rooms));
    }

    @Test
    public void test03() {
        List<List<Integer>> rooms = Arrays.asList(
                Collections.emptyList(),
                Collections.singletonList(0));
        Assert.assertFalse(new KeysAndRooms().canVisitAllRooms(rooms));
    }

    @Test
    public void test04() {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(3, 0, 1),
                Collections.singletonList(2),
                Collections.singletonList(2));
        Assert.assertTrue(new KeysAndRooms().canVisitAllRooms(rooms));
    }
}

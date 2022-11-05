package prasad.leetcode.p1861;

import org.junit.Assert;
import org.junit.Test;

public class RotatingTheBoxTest {

    @Test
    public void test01() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {{'#','.','#'}});
        Assert.assertEquals(3, rotated.length);
        Assert.assertArrayEquals(new char[] {'.'}, rotated[0]);
        Assert.assertArrayEquals(new char[] {'#'}, rotated[1]);
        Assert.assertArrayEquals(new char[] {'#'}, rotated[2]);
    }

    @Test
    public void test02() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {
                {'#','.','*','.'},
                {'#','#','*','.'}});
        Assert.assertEquals(4, rotated.length);
        Assert.assertArrayEquals(new char[] {'#','.'}, rotated[0]);
        Assert.assertArrayEquals(new char[] {'#','#'}, rotated[1]);
        Assert.assertArrayEquals(new char[] {'*','*'}, rotated[2]);
        Assert.assertArrayEquals(new char[] {'.','.'}, rotated[3]);
    }

    @Test
    public void test03() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {
                {'#','#','*','.','*','.'},
                {'#','#','#','*','.','.'},
                {'#','#','#','.','#','.'}});
        Assert.assertEquals(6, rotated.length);
        Assert.assertArrayEquals(new char[] {'.','#','#'}, rotated[0]);
        Assert.assertArrayEquals(new char[] {'.','#','#'}, rotated[1]);
        Assert.assertArrayEquals(new char[] {'#','#','*'}, rotated[2]);
        Assert.assertArrayEquals(new char[] {'#','*','.'}, rotated[3]);
        Assert.assertArrayEquals(new char[] {'#','.','*'}, rotated[4]);
        Assert.assertArrayEquals(new char[] {'#','.','.'}, rotated[5]);
    }

    @Test
    public void test04() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {{'#'}});
        Assert.assertEquals(1, rotated.length);
        Assert.assertArrayEquals(new char[] {'#'}, rotated[0]);
    }

    @Test
    public void test05() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {{'.'}});
        Assert.assertEquals(1, rotated.length);
        Assert.assertArrayEquals(new char[] {'.'}, rotated[0]);
    }

    @Test
    public void test06() {
        char[][] rotated = new RotatingTheBox().rotateTheBox(new char[][] {{'*'}});
        Assert.assertEquals(1, rotated.length);
        Assert.assertArrayEquals(new char[] {'*'}, rotated[0]);
    }

    @Test
    public void testRotateRight01() {
        char[][] rotated = new RotatingTheBox().rotateRight(new char[][] {
                {'a','b','c'},
                {'d','e','f'},
                {'g','h','i'},
                {'j','k','l'}});
        Assert.assertEquals(3, rotated.length);
        Assert.assertArrayEquals(new char[] {'j','g','d','a'}, rotated[0]);
        Assert.assertArrayEquals(new char[] {'k','h','e','b'}, rotated[1]);
        Assert.assertArrayEquals(new char[] {'l','i','f','c'}, rotated[2]);
    }

    @Test
    public void testRotateRight02() {
        char[][] rotated = new RotatingTheBox().rotateRight(new char[][] {{'a'}});
        Assert.assertEquals(1, rotated.length);
        Assert.assertArrayEquals(new char[] {'a'}, rotated[0]);
    }
}

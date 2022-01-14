package prasad.leetcode.p2109;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class AddingSpacesToStringTest {

    @Test
    public void test01() {
        Assert.assertEquals("Enjoy Your Coffee",
                new AddingSpacesToString().addSpaces("EnjoyYourCoffee", new int[] {5, 9}));
    }

    @Test
    public void test02() {
        Assert.assertEquals("Leetcode Helps Me Learn",
                new AddingSpacesToString().addSpaces("LeetcodeHelpsMeLearn", new int[] {8, 13, 15}));
    }

    @Test
    public void test03() {
        Assert.assertEquals("i code in py thon",
                new AddingSpacesToString().addSpaces("icodeinpython", new int[] {1, 5, 7, 9}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(" s p a c i n g",
                new AddingSpacesToString().addSpaces("spacing", new int[] {0, 1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void testTime() {
        int[] spaces = new int[300000];
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 300000; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
            spaces[i] = i;
        }
        long start = System.currentTimeMillis();
        new AddingSpacesToString().addSpaces(sb.toString(), spaces);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}

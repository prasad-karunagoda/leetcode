package prasad.leetcode.p1513;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class NumberOfSubstringsWithOnlyOnesTest {

    @Test
    public void test01() {
        Assert.assertEquals(9, new NumberOfSubstringsWithOnlyOnes().numSub("0110111"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new NumberOfSubstringsWithOnlyOnes().numSub("101"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(21, new NumberOfSubstringsWithOnlyOnes().numSub("111111"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new NumberOfSubstringsWithOnlyOnes().numSub("0"));
    }

    @Test
    public void test05() throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get("string_81037_long.txt"));
        String s = new String(bytes, "UTF-8");
        Assert.assertEquals(200542505, new NumberOfSubstringsWithOnlyOnes().numSub(s));
    }

    @Test
    public void testTime() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int n = 1; n <= 100000; n++) {
            sb.append(random.nextInt(2));
        }
        System.out.println(sb);

        long start = System.currentTimeMillis();
        new NumberOfSubstringsWithOnlyOnes().numSub(sb.toString());
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}

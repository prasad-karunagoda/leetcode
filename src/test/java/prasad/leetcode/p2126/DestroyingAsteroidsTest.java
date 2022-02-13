package prasad.leetcode.p2126;

import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class DestroyingAsteroidsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new DestroyingAsteroids().asteroidsDestroyed(10, new int[] {3,9,19,5,21}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new DestroyingAsteroids().asteroidsDestroyed(5, new int[] {4,9,23,4}));
    }

    @Test
    public void test03() {
        try {
            URL resource = getClass().getClassLoader().getResource("p2126.txt");
            BufferedReader reader = new BufferedReader(new FileReader(new File(resource.toURI())));
            String[] strings = reader.readLine().split(",");
            int[] asteroids = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                asteroids[i] = Integer.parseInt(strings[i]);
            }
            Assert.assertTrue(new DestroyingAsteroids().asteroidsDestroyed(81583, asteroids));
        }
        catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}

package prasad.leetcode.p648;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ReplaceWordsTest {

    @Test
    public void test01() {
        List<String> dictionary = Arrays.asList("cat", "bat", "rat");
        String result = new ReplaceWords().replaceWords(dictionary, "the cattle was rattled by the battery");
        Assert.assertEquals("the cat was rat by the bat", result);
    }

    @Test
    public void test02() {
        List<String> dictionary = Arrays.asList("a", "b", "c");
        String result = new ReplaceWords().replaceWords(dictionary, "aadsfasf absbs bbab cadsfafs");
        Assert.assertEquals("a a b c", result);
    }

    @Test
    public void test03() {
        List<String> dictionary = Arrays.asList("a", "aa", "aaa", "aaaa");
        String result = new ReplaceWords().replaceWords(dictionary, "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa");
        Assert.assertEquals("a a a a a a a a bbb baba a", result);
    }

    @Test
    public void test04() {
        List<String> dictionary = Arrays.asList("catt", "cat", "bat", "rat");
        String result = new ReplaceWords().replaceWords(dictionary, "the cattle was rattled by the battery");
        Assert.assertEquals("the cat was rat by the bat", result);
    }

    @Test
    public void test05() {
        List<String> dictionary = Arrays.asList("ac", "ab");
        String result = new ReplaceWords().replaceWords(dictionary, "it is abnormal that this solution is accepted");
        Assert.assertEquals("it is ab that this solution is ac", result);
    }

    @Test
    public void test06() {
        List<String> dictionary = Collections.singletonList("b");
        String result = new ReplaceWords().replaceWords(dictionary, "a");
        Assert.assertEquals("a", result);
    }

    @Test
    public void testTime() {
        List<String> dictionary = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            dictionary.add(generateString());
        }

        StringBuilder sentence = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            if (i > 1) {
                sentence.append(" ");
            }
            sentence.append(generateString());
        }

        long start = System.currentTimeMillis();
        new ReplaceWords().replaceWords(dictionary, sentence.toString());
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }

    private final Random random = new Random();

    private String generateString() {
        return random.ints(97, 123)
                .limit(100)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}

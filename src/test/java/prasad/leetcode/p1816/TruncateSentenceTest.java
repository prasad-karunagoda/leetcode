package prasad.leetcode.p1816;

import org.junit.Assert;
import org.junit.Test;

public class TruncateSentenceTest {

    @Test
    public void test01() {
        Assert.assertEquals("Hello how are you",
                new TruncateSentence().truncateSentence("Hello how are you Contestant", 4));
    }

    @Test
    public void test02() {
        Assert.assertEquals("Hello how are you Contestant",
                new TruncateSentence().truncateSentence("Hello how are you Contestant", 5));
    }

    @Test
    public void test03() {
        Assert.assertEquals("Hello",
                new TruncateSentence().truncateSentence("Hello how are you Contestant", 1));
    }

    @Test
    public void testTime() {
        String s = "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p q r s t u v w x y z " +
                "a b c d e f g h i j k l m n o p";
        System.out.println("length " + s.length());
        long start = System.currentTimeMillis();
        new TruncateSentence().truncateSentence(s, 249);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}

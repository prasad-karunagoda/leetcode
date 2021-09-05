package prasad.leetcode.p5;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void test01() {
        Assert.assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("a"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("a", new LongestPalindromicSubstring().longestPalindrome("ac"));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        String longestPalindrome = new LongestPalindromicSubstring().longestPalindrome(
                "yRkXCAmm3Fnyz2JBqVO7DGMPkJG4N0lIYGNZ7yinawIQRX8X9yJGHlNtmSVureVzNBWxImYd6OnzAWtfakGy97rnidxzOIXaErHjTM6BeaS157XiXFud8pC9S62WHoktEuHZS2B462gSIIyJFBvDgSTLZhiinv11isk6OlXsB7iXFX9mVIFAognCQNZPRRA2bRuLcMErgMYLmlszEYfF7RJXKSd1bROqR8oY3F7qNW7mvnS1EPwQCfIU1kVbVg6m23VyOZBwzrDpXK1qBmWq7a0yTEvw7N65FDBhzJ0Go7uo6fGfpAQ3JxX2UuizJ2w37w0ht4CYrmzTVuniuRRwA9KCAsyEUpfG5I1CLLJlCWmqSgoArWV6ifofM4nbLjpIUwqbfVpks3TUo9zRwWmqGKTBHhrtVCTdTP0mLLdv3Cr6DBiHwbZDSPNOtydRmiKuPiDUBmiNFBUTxqTaqPkTQ6nUGHcKuUkQOaakxibENwT4ZwtWcpVfGURwQZ3FgeE9v5v1MaWBJRqgjo8jumNDDAItWLXkRFKusp0HHIRrTISx6hUY7MfybMQlQ4crCWLstJAV2igFQaxEcXWvEzrZsCAoqijqqQi1qRdwdz1U5W0iHhciP30ETZkcSh43JaI7DNGPNqynlvFAU4yofeQViDrz5fj7mHnjI7oJ2M3ehqmZP2dr7ieck8KAuk91kCpOcRHEZREsvFhgac1Xg8rVVgvm9wEaV8T7AxDExIRrGnQIC5614APwythYVFEhFPq28nXGDkK535PMFQIYmi0juN9b2fEfXGAH8XludrgMHNn53D1QFBfLtkuJ1xElbSXZQLHXSUWvJoAvTqFBKLSXftxRCyXiNUROrACsucNBBXkkkKZHKPJTZgXA18H6wxj0hKVqCtYN14jtN3228i1eiJSNxOvr6gwWDuLgEzUUDFq8iZTm9F2UGEaZwlYFf3JUoLPUJJCxdPA1nPphK0kwt1Anliwsmrravkmfavox");
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        System.out.println("longestPalindrome = " + longestPalindrome);
    }
}

package prasad.leetcode.p1456;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumberOfVowelsInSubstringTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new MaxNumberOfVowelsInSubstring().maxVowels("abciiidef", 3));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new MaxNumberOfVowelsInSubstring().maxVowels("aeiou", 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals(2, new MaxNumberOfVowelsInSubstring().maxVowels("leetcode", 3));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaxNumberOfVowelsInSubstring().maxVowels("e", 1));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new MaxNumberOfVowelsInSubstring().maxVowels("p", 1));
    }

    @Test
    public void test06() {
        Assert.assertEquals(4, new MaxNumberOfVowelsInSubstring().maxVowels("weallloveyou", 7));
    }

    @Test
    public void testTime() {
        StringBuilder sb = new StringBuilder();
        for (int n = 1; n <= 100; n++) {
            sb.append("gohkwgkbzgbyixthyoxnymzyqxoynjknumeimtvnjacqmjvxbelpbhydqtplwhfyfzedctozcrodwzgvtrrazznvwayjjwebhhnllijcaosyhykuvbbutmdsmwcnpijjqiutdqixzscsudlriynepghouvidctdctzpadxowycvtyerkanvpeppexiflmtqupbraldxqbypjiqxweytonyffgewimoktvkdseulqhhxdcuuyqbaullamnqksabtemkwgzqgcfzunpewywugglgdijpphvloaxqrvfuebpaoedocrurbfzobwmbukoyyqoqdojjkbfsinvcfjlkjpelvinmoumfvnzvfgvvkeybtzvbjdorazkeiveyjvdzddkbpdlzpfdrkzbbfzebsxbynqlxrjcpynrojunukatjwendocfnhcovupqwkmvsaydujrabbevzqxhptzslhfoxfypawbbabtfqoqlzrvlujqqwzmenbvtxldyflgobmljmzhstqaitaytvwczetqthwemxqmhcavwgyhncwgyalkwwaiaaphmdvnjzwjsivyrfnceouhazxvenkqrcowhjqmogjuldwvbvhpphlfietljriwcaegpmnzdkaarieaabuskwvntexziweallndnbzjkjifpgqwyskogwmbonvmjnitzzpocozhbcsvzkbsxzyuvlnbyxqmpdrjapuktqtpojvbazwemmgerhxjrigoyjpxbhwzbtpaokdzvyqqnjvpldnfgajnjminkqbizeldjyofjggywdggxyeflfvmupcwwijeucuuqicvlrhfjitnhdinbjjapriwbnjfmwenthvdrkvzklrubaltgzjccoholwrgcuugoiiadthbxlhjfkgwmzvirslnzmoritvirhogyvdkfgbtluorvmkwuqyhysltybqwfdtqamlcktfzcobgojetjrcwaovwjcddxdxslfgvlklbazed");
        }
        String s = sb.toString();

        long start = System.currentTimeMillis();
        new MaxNumberOfVowelsInSubstring().maxVowels(s, 50_000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}

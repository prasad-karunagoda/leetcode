package prasad.leetcode.p1513;

public class NumberOfSubstringsWithOnlyOnes {

    public int numSub(String s) {
        String[] ones = s.split("[0]+");
        long substringCount = 0;
        for (String str : ones) {
            substringCount += triangularNumber(str.length());
        }
        return (int) (substringCount % 1000000007);
    }

    private long triangularNumber(long num) {
        return (num * (num + 1)) / 2;
    }
}

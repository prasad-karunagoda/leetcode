package prasad.leetcode.p1689;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    
    public int minPartitions(String n) {
        for (int x = 9; x >= 1; x--) {
            if (n.contains(String.valueOf(x))) {
                return x;
            }
        }
        throw new IllegalArgumentException("Input n must be a number greater than 0.");
    }
}

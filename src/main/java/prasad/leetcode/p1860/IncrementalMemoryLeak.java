package prasad.leetcode.p1860;

public class IncrementalMemoryLeak {

    public int[] memLeak(int memory1, int memory2) {
        int second = 1;
        while (true) {
            if (memory1 >= memory2) {
                if (memory1 < second) {
                    return new int[] {second, memory1, memory2};
                }
                else {
                    memory1 -= second;
                }
            }
            else {
                if (memory2 < second) {
                    return new int[] {second, memory1, memory2};
                }
                else {
                    memory2 -= second;
                }
            }
            second++;
        }
    }
}

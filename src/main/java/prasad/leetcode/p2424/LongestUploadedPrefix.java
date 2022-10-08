package prasad.leetcode.p2424;

public class LongestUploadedPrefix {

    private final boolean[] uploaded;
    private int prefix;

    public LongestUploadedPrefix(int n) {
        uploaded = new boolean[n];
        prefix = 0;
    }

    public void upload(int video) {
        uploaded[video - 1] = true;
    }

    public int longest() {
        int i = prefix;
        while (i < uploaded.length && uploaded[i]) {
            i++;
        }
        prefix = i;
        return prefix;
    }
}

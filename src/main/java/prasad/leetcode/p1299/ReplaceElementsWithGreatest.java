package prasad.leetcode.p1299;

public class ReplaceElementsWithGreatest {

    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = greatest;
            greatest = Math.max(greatest, current);
        }
        return arr;
    }
}

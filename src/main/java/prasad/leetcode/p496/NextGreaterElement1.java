package prasad.leetcode.p496;

public class NextGreaterElement1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nextGreater[i] = -1;
        }

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int n2 : nums2) {
                if (nums1[i] == n2) {
                    found = true;
                }
                if (found && nums1[i] < n2) {
                    nextGreater[i] = n2;
                    break;
                }
            }
        }
        return nextGreater;
    }
}

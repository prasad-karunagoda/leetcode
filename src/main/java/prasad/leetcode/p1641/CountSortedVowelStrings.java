package prasad.leetcode.p1641;

import java.util.Arrays;

public class CountSortedVowelStrings {

    public int countVowelStrings(int n) {
        /*
         * n = 1  ->   1  +  1  +  1  +  1  +  1  =  5
         * n = 2  ->   1  +  2  +  3  +  4  +  5  = 15
         * n = 3  ->   1  +  3  +  6  + 10  + 15  = 35
         * n = 4  ->   1  +  4  + 10  + 20  + 35  = 70
         */
        int[] array = new int[] {1, 1, 1, 1, 1};
        for (int x = 1; x < n; x++) {
            int[] newArray = new int[5];
            for (int i = 0; i < 5; i++) {
                int sum = 0;
                for (int j = 0; j <= i; j++) {
                    sum += array[j];
                }
                newArray[i] = sum;
            }
            array = newArray;
        }

        return Arrays.stream(array).sum();
    }
}

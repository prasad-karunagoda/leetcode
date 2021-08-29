package prasad.leetcode.p1093;

public class StatisticsFromLargeSample {

    public double[] sampleStats(int[] count) {
        if (count.length != 256) {
            throw new IllegalArgumentException("Invalid input array length: " + count.length);
        }

        double minimum = -1.0;
        for (int n = 0; n < count.length; n++) {
            if (count[n] > 0) {
                minimum = n;
                break;
            }
        }

        double maximum = -1.0;
        for (int n = count.length - 1; n >= 0; n--) {
            if (count[n] > 0) {
                maximum = n;
                break;
            }
        }

        int numberOfElements = 0;
        double sum = 0.0;
        int maxCount = 0;
        double mode = -1.0;
        for (int n = 0; n < count.length; n++) {
            numberOfElements = numberOfElements + count[n];
            // Casted to long to avoid number overflow in the multiplication.
            sum = sum + (n * (long) count[n]);
            if (maxCount < count[n]) {
                maxCount = count[n];
                mode = n;
            }
        }
        double mean = sum / numberOfElements;

        double median;
        if (numberOfElements % 2 == 0) { // Even
            int firstIndex = (numberOfElements / 2) - 1; // Minus 1 to make it zero-based
            int secondIndex = firstIndex + 1;
            median = ((double) (getNumber(count, firstIndex) + getNumber(count, secondIndex))) / 2;
        }
        else { // Odd
            int index = numberOfElements / 2;
            median = getNumber(count, index);
        }

        return new double[] {minimum, maximum, mean, median, mode};
    }

    int getNumber(int[] count, int index) {
        int elementCount = 0;
        for (int n = 0; n < count.length; n++) {
            elementCount = elementCount + count[n];
            if (index < elementCount) {
                return n;
            }
        }
        throw new IllegalArgumentException("index is not in the range.");
    }
}

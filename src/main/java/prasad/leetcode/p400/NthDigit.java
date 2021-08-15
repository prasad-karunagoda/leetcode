package prasad.leetcode.p400;

public class NthDigit {

    /**
     * 1-digit numbers: 9, 2-digit numbers: 90, 3-digit numbers: 900, ...
     * Find which group n belongs. And then find the digit.
     *
     * Data type long is used to avoid number overflow.
     */
    public int findNthDigit(int n) {
        long[] passedLengthAndCurrentGroupNumberOfDigits = getPassedLengthAndCurrentGroupNumberOfDigits(n);
        long passedLength = passedLengthAndCurrentGroupNumberOfDigits[0];
        long currentGroupNumberOfDigits = passedLengthAndCurrentGroupNumberOfDigits[1];

        long currentGroupLength = n - passedLength;

        long positionInCurrentGroup = currentGroupLength / currentGroupNumberOfDigits;
        long remainder = currentGroupLength % currentGroupNumberOfDigits;

        char lastDigit;
        if (remainder == 0) {
            String str = String.valueOf(((long) Math.pow(10, currentGroupNumberOfDigits - 1)) + positionInCurrentGroup - 1);
            lastDigit = str.charAt(str.length() - 1);
        }
        else {
            String str = String.valueOf(((long) Math.pow(10, currentGroupNumberOfDigits - 1)) + positionInCurrentGroup);
            lastDigit = str.charAt(((int) remainder) - 1);
        }
        return Integer.parseInt(String.valueOf(lastDigit));
    }

    long[] getPassedLengthAndCurrentGroupNumberOfDigits(int n) {
        long numberOfDigits = 1;
        long previousGroupLength = 0;
        long groupLength = 9;
        while (n > groupLength) {
            numberOfDigits++;
            long temp = groupLength + 9 * numberOfDigits * (long) Math.pow(10, numberOfDigits - 1);
            previousGroupLength = groupLength;
            groupLength = temp;
        }
        return new long[] {previousGroupLength, numberOfDigits};
    }
}

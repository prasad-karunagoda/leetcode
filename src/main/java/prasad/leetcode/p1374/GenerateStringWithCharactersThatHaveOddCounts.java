package prasad.leetcode.p1374;

import java.util.Collections;

public class GenerateStringWithCharactersThatHaveOddCounts {

    public String generateTheString(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Argument n must be greater than 0.");
        }
        else if (n == 1) {
            return "a";
        }

        if (n % 2 == 0) {
            return "a" + String.join("", Collections.nCopies(n - 1, "b"));
        }
        else {
            return "ab" + String.join("", Collections.nCopies(n - 2, "c"));
        }
    }
}

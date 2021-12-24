package prasad.leetcode.p1003;

public class CheckIfWordIsValidAfterSubstitutions {

    public boolean isValid(String s) {
        while (s.contains("abc")) {
            s = s.replace("abc", "");
        }
        return s.isEmpty();
    }
}

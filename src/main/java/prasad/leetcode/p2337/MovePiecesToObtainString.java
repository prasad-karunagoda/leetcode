package prasad.leetcode.p2337;

import java.util.ArrayList;
import java.util.List;

public class MovePiecesToObtainString {

    public boolean canChange(String start, String target) {
        String trimmedStart = start.replace("_", "");
        String trimmedTarget = target.replace("_", "");
        if (!trimmedStart.equals(trimmedTarget)) {
            return false;
        }

        List<Integer> inStartSpacesLeftToL = getSpacesLeftToL(start);
        List<Integer> inStartSpacesRightToR = getSpacesRightToR(start);
        List<Integer> inTargetSpacesLeftToL = getSpacesLeftToL(target);
        List<Integer> inTargetSpacesRightToR = getSpacesRightToR(target);

        for (int i = 0; i < inStartSpacesLeftToL.size(); i++) {
            if (inStartSpacesLeftToL.get(i) < inTargetSpacesLeftToL.get(i)) {
                return false;
            }
        }

        for (int i = 0; i < inStartSpacesRightToR.size(); i++) {
            if (inStartSpacesRightToR.get(i) < inTargetSpacesRightToR.get(i)) {
                return false;
            }
        }

        return true;
    }

    private List<Integer> getSpacesLeftToL(String string) {
        List<Integer> spacesLeftToL = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c  = string.charAt(i);
            if (c == '_') {
                count++;
            }
            else if (c == 'L') {
                spacesLeftToL.add(count);
            }
        }
        return spacesLeftToL;
    }

    private List<Integer> getSpacesRightToR(String string) {
        List<Integer> spacesRightToR = new ArrayList<>();
        int count = 0;
        for (int i = string.length() - 1; i >= 0; i--) {
            char c  = string.charAt(i);
            if (c == '_') {
                count++;
            }
            else if (c == 'R') {
                spacesRightToR.add(count);
            }
        }
        return spacesRightToR;
    }
}

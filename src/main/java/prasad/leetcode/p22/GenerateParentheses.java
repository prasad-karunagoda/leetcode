package prasad.leetcode.p22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        Set<String> set = new HashSet<>();
        set.add("()");
        for (int x = 2; x <= n; x++) {
            Set<String> localSet = new HashSet<>(set);
            set = new HashSet<>();
            Iterator<String> iterator = localSet.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                for (int i = 0; i <= s.length(); i++) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(i, "()");
                    set.add(sb.toString());
                }
            }
        }
        return new ArrayList<>(set);
    }
}

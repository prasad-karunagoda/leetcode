package prasad.leetcode.p690;

import java.util.Collections;
import java.util.List;

class Employee {

    int id;
    int importance;
    List<Integer> subordinates;

    Employee(int id, int importance) {
        this(id, importance, Collections.emptyList());
    }

    Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }
}

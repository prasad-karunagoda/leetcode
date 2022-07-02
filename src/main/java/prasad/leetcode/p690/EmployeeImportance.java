package prasad.leetcode.p690;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImportance {

    private Map<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        map = employees.stream().collect(Collectors.toMap(e -> e.id, e -> e));
        Employee e = map.get(id);
        return getTotalImportance(e);
    }

    private int getTotalImportance(Employee employee) {
        if (employee == null) {
            return 0;
        }

        if (employee.subordinates == null || employee.subordinates.isEmpty()) {
            return employee.importance;
        }
        else {
            int total = employee.importance;
            for (Integer id : employee.subordinates) {
                total += getTotalImportance(map.get(id));
            }
            return total;
        }
    }
}

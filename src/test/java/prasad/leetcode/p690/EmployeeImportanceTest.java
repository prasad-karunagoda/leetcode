package prasad.leetcode.p690;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class EmployeeImportanceTest {

    @Test
    public void test01() {
        int totalImportance = new EmployeeImportance().getImportance(Arrays.asList(
                new Employee(1, 5, Arrays.asList(2, 3)),
                new Employee(2, 3),
                new Employee(3, 3)), 1);
        Assert.assertEquals(11, totalImportance);
    }

    @Test
    public void test02() {
        int totalImportance = new EmployeeImportance().getImportance(Arrays.asList(
                new Employee(1, 2, Collections.singletonList(5)),
                new Employee(5, -3)), 5);
        Assert.assertEquals(-3, totalImportance);
    }

    @Test
    public void test03() {
        int totalImportance = new EmployeeImportance().getImportance(Collections.singletonList(
                new Employee(5, 7)), 5);
        Assert.assertEquals(7, totalImportance);
    }

    @Test
    public void test04() {
        int totalImportance = new EmployeeImportance().getImportance(Collections.singletonList(
                new Employee(5, 7)), 2);
        Assert.assertEquals(0, totalImportance);
    }
}

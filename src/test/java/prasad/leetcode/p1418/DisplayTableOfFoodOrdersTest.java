package prasad.leetcode.p1418;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DisplayTableOfFoodOrdersTest {

    @Test
    public void test01() {
        List<List<String>> orders = Arrays.asList(
                Arrays.asList("David","3","Ceviche"),
                Arrays.asList("Corina","10","Beef Burrito"),
                Arrays.asList("David","3","Fried Chicken"),
                Arrays.asList("Carla","5","Water"),
                Arrays.asList("Carla","5","Ceviche"),
                Arrays.asList("Rous","3","Ceviche"));
        List<List<String>> result = new DisplayTableOfFoodOrders().displayTable(orders);
        Assert.assertEquals(4, result.size());
        Assert.assertEquals(Arrays.asList("Table","Beef Burrito","Ceviche","Fried Chicken","Water"), result.get(0));
        Assert.assertEquals(Arrays.asList("3","0","2","1","0"), result.get(1));
        Assert.assertEquals(Arrays.asList("5","0","1","0","1"), result.get(2));
        Assert.assertEquals(Arrays.asList("10","1","0","0","0"), result.get(3));
    }

    @Test
    public void test02() {
        List<List<String>> orders = Arrays.asList(
                Arrays.asList("James","12","Fried Chicken"),
                Arrays.asList("Ratesh","12","Fried Chicken"),
                Arrays.asList("Amadeus","12","Fried Chicken"),
                Arrays.asList("Adam","1","Canadian Waffles"),
                Arrays.asList("Brianna","1","Canadian Waffles"));
        List<List<String>> result = new DisplayTableOfFoodOrders().displayTable(orders);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(Arrays.asList("Table","Canadian Waffles","Fried Chicken"), result.get(0));
        Assert.assertEquals(Arrays.asList("1","2","0"), result.get(1));
        Assert.assertEquals(Arrays.asList("12","0","3"), result.get(2));
    }

    @Test
    public void test03() {
        List<List<String>> orders = Arrays.asList(
                Arrays.asList("Laura","2","Bean Burrito"),
                Arrays.asList("Jhon","2","Beef Burrito"),
                Arrays.asList("Melissa","2","Soda"));
        List<List<String>> result = new DisplayTableOfFoodOrders().displayTable(orders);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(Arrays.asList("Table","Bean Burrito","Beef Burrito","Soda"), result.get(0));
        Assert.assertEquals(Arrays.asList("2","1","1","1"), result.get(1));
    }
}

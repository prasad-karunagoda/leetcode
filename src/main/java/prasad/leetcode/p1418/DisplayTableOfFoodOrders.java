package prasad.leetcode.p1418;

import java.util.*;

public class DisplayTableOfFoodOrders {

    public List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, HashMap<String, Integer>> map = new TreeMap<>();
        List<String> foodList = new ArrayList<>();
        for (List<String> o : orders) {
            Integer tableNumber = Integer.valueOf(o.get(1));
            String food = o.get(2);

            if (!foodList.contains(food)) {
                foodList.add(food);
            }

            if (map.containsKey(tableNumber)) {
                HashMap<String, Integer> foodMap = map.get(tableNumber);
                if (foodMap.containsKey(food)) {
                    foodMap.put(food, foodMap.get(food) + 1);
                }
                else {
                    foodMap.put(food, 1);
                }
            }
            else {
                HashMap<String, Integer> foodMap = new HashMap<>();
                foodMap.put(food, 1);
                map.put(tableNumber, foodMap);
            }
        }

        List<List<String>> result = new ArrayList<>();
        Collections.sort(foodList);

        for (Map.Entry<Integer, HashMap<String, Integer>> entry : map.entrySet()) {
            List<String> row = new ArrayList<>();
            row.add(entry.getKey().toString());
            HashMap<String, Integer> foodMap = entry.getValue();
            for (String f : foodList) {
                if (foodMap.containsKey(f)) {
                    row.add(foodMap.get(f).toString());
                }
                else {
                    row.add("0");
                }
            }
            result.add(row);
        }

        foodList.add(0, "Table");
        result.add(0, foodList);
        return result;
    }
}

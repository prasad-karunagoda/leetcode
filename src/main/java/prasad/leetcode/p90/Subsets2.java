package prasad.leetcode.p90;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Bag<Integer>> bags = subsetsWithDup0(nums);
        return convertToLists(bags);
    }

    private List<List<Integer>> convertToLists(List<Bag<Integer>> bags) {
        List<List<Integer>> lists = new ArrayList<>();
        for (List<Integer> b : bags) {
            lists.add(new ArrayList<>(b));
        }
        return lists;
    }

    private List<Bag<Integer>> subsetsWithDup0(int[] nums) {
        if (nums.length == 1) {
            Bag<Integer> emptyBag = new Bag<>();
            Bag<Integer> singleItemBag = new Bag<>();
            singleItemBag.add(nums[0]);

            List<Bag<Integer>> list = new ArrayList<>();
            list.add(emptyBag);
            list.add(singleItemBag);
            return list;
        }

        int[] oneLessNums = new int[nums.length - 1];
        System.arraycopy(nums, 1, oneLessNums, 0, nums.length - 1);
        List<Bag<Integer>> subsets = subsetsWithDup0(oneLessNums);
        List<Bag<Integer>> addedSets = new ArrayList<>();
        for (Bag<Integer> set : subsets) {
            Bag<Integer> copy = new Bag<>(set);
            copy.add(nums[0]);
            if (!subsets.contains(copy)) {
                addedSets.add(copy);
            }
        }

        subsets.addAll(addedSets);
        return subsets;
    }


    class Bag<E> extends ArrayList<E> {

        public Bag() {
            super();
        }

        public Bag(Collection<? extends E> c) {
            super(c);
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            else if (!(o instanceof Bag)) {
                return false;
            }

            Bag<E> otherBag = (Bag) o;
            Map<E, Integer> otherMap = convertToMap(otherBag);
            Map<E, Integer> thisMap = convertToMap(this);
            return thisMap.equals(otherMap);
        }

        private Map<E, Integer> convertToMap(Bag<E> bag) {
            Map<E, Integer> otherMap = new HashMap<>();
            for (E e : bag) {
                if (otherMap.containsKey(e)) {
                    otherMap.put(e, otherMap.get(e) + 1);
                }
                else {
                    otherMap.put(e, 1);
                }
            }
            return otherMap;
        }
    }
}

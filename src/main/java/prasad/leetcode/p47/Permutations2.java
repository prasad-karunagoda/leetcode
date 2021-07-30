package prasad.leetcode.p47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations2 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> numsList  = new ArrayList<>();
        for (int n : nums) {
            numsList.add(n);
        }
        return permutations(numsList);
    }

    private List<List<Integer>> permutations(List<Integer> numbers) {
        if (numbers.size() == 1) {
            List<Integer> list = new ArrayList<>();
            list.add(numbers.get(0));

            List<List<Integer>> lists = new ArrayList<>();
            lists.add(list);
            return lists;
        }

        Set<List<Integer>> permutations = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> remainingNumbers = new ArrayList<>(numbers);
            Integer oneNumber = remainingNumbers.remove(i);
            List<List<Integer>> perms = permutations(remainingNumbers);
            for (int j = 0; j < perms.size(); j++) {
                List<Integer> p = perms.get(j);
                p.add(0, oneNumber);
            }
            permutations.addAll(perms);
        }
        return new ArrayList<>(permutations);
    }
}

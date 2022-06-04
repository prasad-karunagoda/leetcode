package prasad.leetcode.p950;

import java.util.ArrayList;
import java.util.Arrays;

public class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!list.isEmpty()) {
                Integer lastElement = list.remove(list.size() - 1);
                list.add(0, lastElement);
            }
            list.add(0, deck[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}

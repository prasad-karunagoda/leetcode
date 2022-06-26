package prasad.leetcode.p1333;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRestaurants {

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        return Arrays.stream(restaurants)
                .map(Restaurant::new)
                .filter(res -> (veganFriendly == 0 || res.isVeganFriendly == 1) && res.price <= maxPrice && res.distance <= maxDistance)
                .sorted()
                .map(res -> res.id)
                .collect(Collectors.toList());
    }

    private static class Restaurant implements Comparable<Restaurant> {
        private final int id;
        private final int rating;
        private final int isVeganFriendly;
        private final int price;
        private final int distance;

        private Restaurant(int[] array) {
            this.id = array[0];
            this.rating = array[1];
            this.isVeganFriendly = array[2];
            this.price = array[3];
            this.distance = array[4];
        }

        @Override
        public int compareTo(Restaurant other) {
            if (this.rating > other.rating) {
                return -1; // Descending order
            }
            else if (this.rating < other.rating) {
                return 1;
            }
            else {
                return other.id - this.id;
            }
        }
    }
}

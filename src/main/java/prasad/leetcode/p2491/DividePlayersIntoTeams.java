package prasad.leetcode.p2491;

import java.util.Arrays;

public class DividePlayersIntoTeams {

    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int sum = skill[0] + skill[skill.length - 1];
        long chemistry = (long) skill[0] * (long) skill[skill.length - 1];
        for (int i = 1; i < skill.length / 2; i++) {
            if (skill[i] + skill[skill.length - 1 - i] == sum) {
                chemistry += ((long) skill[i] * (long) skill[skill.length - 1 - i]);
            }
            else {
                return -1;
            }
        }
        return chemistry;
    }
}

package prasad.leetcode.p2491;

import org.junit.Assert;
import org.junit.Test;

public class DividePlayersIntoTeamsTest {

    @Test
    public void test01() {
        Assert.assertEquals(22, new DividePlayersIntoTeams().dividePlayers(new int[] {3,2,5,1,3,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(12, new DividePlayersIntoTeams().dividePlayers(new int[] {3,4}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new DividePlayersIntoTeams().dividePlayers(new int[] {1,1,2,3}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(284, new DividePlayersIntoTeams().dividePlayers(new int[] {16,6,11,5,3,13,14,8}));
    }
}

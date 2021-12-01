package prasad.leetcode.p1366;

import org.junit.Assert;
import org.junit.Test;

public class RankTeamsByVotesTest {

    @Test
    public void test01() {
        Assert.assertEquals("ACB", new RankTeamsByVotes().rankTeams(
                new String[] {"ABC","ACB","ABC","ACB","ACB"}));
    }

    @Test
    public void test02() {
        Assert.assertEquals("XWYZ", new RankTeamsByVotes().rankTeams(
                new String[] {"WXYZ","XYZW"}));
    }

    @Test
    public void test03() {
        Assert.assertEquals("ZMNAGUEDSJYLBOPHRQICWFXTVK", new RankTeamsByVotes().rankTeams(
                new String[] {"ZMNAGUEDSJYLBOPHRQICWFXTVK"}));
    }

    @Test
    public void test04() {
        Assert.assertEquals("ABC", new RankTeamsByVotes().rankTeams(
                new String[] {"BCA","CAB","CBA","ABC","ACB","BAC"}));
    }

    @Test
    public void test05() {
        Assert.assertEquals("KDMP", new RankTeamsByVotes().rankTeams(
                new String[] {"DMKP","KMPD","KPMD"}));
    }
}

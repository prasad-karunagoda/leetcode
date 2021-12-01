package prasad.leetcode.p1366;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RankTeamsByVotes {

    public String rankTeams(String[] votes) {
        TeamVotes[] teamVotesArray = new TeamVotes[26];
        for (String v : votes) {
            for (int i = 0; i < v.length(); i++) {
                int index = v.charAt(i) - 'A';
                if (teamVotesArray[index] == null) {
                    teamVotesArray[index] = new TeamVotes(String.valueOf(v.charAt(i)), v.length());
                }
                teamVotesArray[index].addVote(i);
            }
        }

        List<TeamVotes> teamVotes = new ArrayList<>();
        for (TeamVotes t : teamVotesArray) {
            if (t != null) {
                teamVotes.add(t);
            }
        }
        return teamVotes.stream().sorted().map(t -> t.team).collect(Collectors.joining());
    }

    private static class TeamVotes implements Comparable<TeamVotes> {
        private final String team;
        private final int[] votes;

        private TeamVotes(String team, int numberOfTeams) {
            this.team = team;
            this.votes = new int[numberOfTeams];
        }

        private void addVote(int rank) {
            votes[rank]++;
        }

        @Override
        public int compareTo(TeamVotes other) {
            for (int i = 0; i < this.votes.length; i++) {
                if (this.votes[i] > other.votes[i]) {
                    return -1;
                }
                else if (this.votes[i] < other.votes[i]) {
                    return 1;
                }
            }
            return this.team.compareTo(other.team);
        }
    }
}

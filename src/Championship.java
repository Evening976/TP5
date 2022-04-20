import java.util.ArrayList;
import java.util.List;

public class Championship {
    private final String name;
    List<Team> teams;
    List<MatchResult> previousMatches;

    public Championship(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.previousMatches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Team getTeam(Team t) {
        return teams.get(teams.indexOf(t));
    }

    public void add(Team t) {
        if(!teams.contains(t))
            teams.add(t);
    }

    public void add(MatchResult result) {
        if (!previousMatches.contains(result)) {
            previousMatches.add(result);
        }
    }

    public List<MatchResult> getPreviousMatches() {
        return previousMatches;
    }

    public String toString(){
        StringBuilder s = new StringBuilder(this.name + "\n\n");
        for (MatchResult p : previousMatches){
                s.append(p).append("\n");
        }
        return s.toString();
    }
}

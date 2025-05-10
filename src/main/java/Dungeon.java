import java.util.HashSet;
import java.util.Set;

public class Dungeon {
    private Chamber startChamber;
    private Chamber goalChamber;
    private Set<Chamber> chambers;

    public Dungeon() {
        chambers = new HashSet<>();
    }

    public void addChamber(Chamber chamber) {
        chambers.add(chamber);
    }

    public void setStartChamber(Chamber chamber) {
        this.startChamber = chamber;
    }

    public void setGoalChamber(Chamber chamber) {
        this.goalChamber = chamber;
    }

    public Chamber getStartChamber() {
        return startChamber;
    }

    public Chamber getGoalChamber() {
        return goalChamber;
    }

    public boolean isGoalChamber(Chamber chamber) {
        return chamber.equals(goalChamber);
    }
}


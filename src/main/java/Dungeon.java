import java.util.HashSet;
import java.util.Set;

/**
 * Represents the dungeon containing chambers and goal logic.
 */
public class Dungeon {
    private Chamber startChamber;
    private Chamber goalChamber;
    private Set<Chamber> chambers;

    /**
     * Constructs an empty dungeon.
     */
    public Dungeon() {
        chambers = new HashSet<>();
    }

    /**
     * Adds a chamber to the dungeon.
     *
     * @param chamber the chamber to add
     */
    public void addChamber(Chamber chamber) {
        chambers.add(chamber);
    }

    /**
     * Sets the starting chamber of the dungeon.
     *
     * @param chamber the start chamber
     */
    public void setStartChamber(Chamber chamber) {
        this.startChamber = chamber;
    }

    /**
     * Sets the goal chamber of the dungeon.
     *
     * @param chamber the goal chamber
     */
    public void setGoalChamber(Chamber chamber) {
        this.goalChamber = chamber;
    }

    /**
     * Returns the start chamber.
     *
     * @return the start chamber
     */
    public Chamber getStartChamber() {
        return startChamber;
    }

    /**
     * Returns the goal chamber.
     *
     * @return the goal chamber
     */
    public Chamber getGoalChamber() {
        return goalChamber;
    }

    /**
     * Checks if a chamber is the goal.
     *
     * @param chamber the chamber to check
     * @return true if it is the goal chamber
     */
    public boolean isGoalChamber(Chamber chamber) {
        return chamber.equals(goalChamber);
    }
}



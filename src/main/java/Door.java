/**
 * Represents a door between chambers, optionally guarded by a monster.
 */
public class Door {
    private Chamber leadsTo;
    private Monster guardian;

    /**
     * Constructs a door to a chamber.
     *
     * @param leadsTo the chamber the door leads to
     */
    public Door(Chamber leadsTo) {
        this.leadsTo = leadsTo;
    }

    /**
     * Constructs a guarded door.
     *
     * @param leadsTo  the chamber the door leads to
     * @param guardian the monster guarding the door
     */
    public Door(Chamber leadsTo, Monster guardian) {
        this.leadsTo = leadsTo;
        this.guardian = guardian;
    }

    /**
     * Returns the chamber the door leads to.
     *
     * @return target chamber
     */
    public Chamber getLeadsTo() {
        return leadsTo;
    }

    /**
     * Checks if the door is blocked by a monster.
     *
     * @return true if blocked
     */
    public boolean isBlocked() {
        return guardian != null && guardian.isAlive();
    }

    /**
     * Returns the monster guarding the door.
     *
     * @return the guardian monster
     */
    public Monster getGuardian() {
        return guardian;
    }

    /**
     * Removes the guardian from the door.
     */
    public void removeGuardian() {
        guardian = null;
    }

    /**
     * Returns a string representation of the door.
     *
     * @return string description
     */
    @Override
    public String toString() {
        return "Door to " + leadsTo.getName() + (isBlocked() ? " [Blocked by " + guardian.getName() + "]" : " [Clear]");
    }
}


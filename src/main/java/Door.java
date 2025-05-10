public class Door {
    private Chamber leadsTo;
    private Monster guardian;

    public Door(Chamber leadsTo) {
        this.leadsTo = leadsTo;
    }

    public Door(Chamber leadsTo, Monster guardian) {
        this.leadsTo = leadsTo;
        this.guardian = guardian;
    }

    public Chamber getLeadsTo() {
        return leadsTo;
    }

    public boolean isBlocked() {
        return guardian != null && guardian.isAlive();
    }

    public Monster getGuardian() {
        return guardian;
    }

    public void removeGuardian() {
        guardian = null;
    }

    @Override
    public String toString() {
        return "Door to " + leadsTo.getName() + (isBlocked() ? " [Blocked by " + guardian.getName() + "]" : " [Clear]");
    }
}

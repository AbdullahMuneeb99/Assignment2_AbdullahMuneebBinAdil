/**
 * Represents an action where the player fights the monster blocking a door.
 */
public class FightAction implements Action {
    private Character player;
    private Door door;

    /**
     * Constructs a FightAction.
     *
     * @param player the player character
     * @param door   the door with a guarding monster
     */
    public FightAction(Character player, Door door) {
        this.player = player;
        this.door = door;
    }

    /**
     * Returns a description of the fight action.
     *
     * @return description string
     */
    @Override
    public String getDescription() {
        return "Fight " + door.getGuardian();
    }

    /**
     * Executes the fight, removes the guardian if defeated.
     */
    @Override
    public void execute() {
        Monster monster = door.getGuardian();
        if (monster != null && monster.isAlive()) {
            Fight.execute(player, monster);
            if (!monster.isAlive()) {
                door.removeGuardian();
                System.out.println("Monster defeated! The door is now unblocked.");
            }
        } else {
            System.out.println("There’s no monster here.");
        }
    }
}


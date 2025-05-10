/**
 * Represents an action to move the player through a door to another chamber.
 */
public class Move implements Action {
    private GameState gameState;
    private Door door;

    /**
     * Constructs a Move action.
     *
     * @param gameState the current game state
     * @param door      the door to move through
     */
    public Move(GameState gameState, Door door) {
        this.gameState = gameState;
        this.door = door;
    }

    /**
     * Returns a description of the move action.
     *
     * @return description string
     */
    @Override
    public String getDescription() {
        return "Move through door to " + door.getLeadsTo().getName();
    }

    /**
     * Executes the move if the door is not blocked.
     */
    @Override
    public void execute() {
        if (door.isBlocked()) {
            System.out.println("The door is blocked by a monster!");
        } else {
            gameState.setCurrentChamber(door.getLeadsTo());
            System.out.println("You moved to " + door.getLeadsTo().getName());
        }
    }
}



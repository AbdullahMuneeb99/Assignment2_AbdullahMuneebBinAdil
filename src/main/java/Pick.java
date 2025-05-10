/**
 * Represents an action to pick up an item in the current chamber.
 */
public class Pick implements Action {
    private Character player;
    private Chamber chamber;
    private Item item;

    /**
     * Constructs a Pick action.
     *
     * @param player  the player character
     * @param chamber the chamber containing the item
     * @param item    the item to pick up
     */
    public Pick(Character player, Chamber chamber, Item item) {
        this.player = player;
        this.chamber = chamber;
        this.item = item;
    }

    /**
     * Returns a description of the pick-up action.
     *
     * @return description string
     */
    @Override
    public String getDescription() {
        return "Pick up " + item;
    }

    /**
     * Executes the item pick-up by the player.
     */
    @Override
    public void execute() {
        player.pickUpItem(item);
        chamber.getItems().remove(item);
        System.out.println("You picked up: " + item);
    }
}


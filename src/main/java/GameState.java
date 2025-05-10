/**
 * Holds the current state of the game including the player's position.
 */
public class GameState {
    private Character player;
    private Chamber currentChamber;

    /**
     * Constructs a GameState.
     *
     * @param player the player character
     * @param start  the starting chamber
     */
    public GameState(Character player, Chamber start) {
        this.player = player;
        this.currentChamber = start;
    }

    /**
     * Returns the player character.
     *
     * @return the player
     */
    public Character getPlayer() {
        return player;
    }

    /**
     * Returns the current chamber the player is in.
     *
     * @return current chamber
     */
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    /**
     * Sets the current chamber.
     *
     * @param chamber the chamber to set as current
     */
    public void setCurrentChamber(Chamber chamber) {
        this.currentChamber = chamber;
    }
}



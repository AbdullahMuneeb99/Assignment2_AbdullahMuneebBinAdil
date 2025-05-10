public class GameState {
    private Character player;
    private Chamber currentChamber;

    public GameState(Character player, Chamber start) {
        this.player = player;
        this.currentChamber = start;
    }

    public Character getPlayer() {
        return player;
    }

    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    public void setCurrentChamber(Chamber chamber) {
        this.currentChamber = chamber;
    }
}


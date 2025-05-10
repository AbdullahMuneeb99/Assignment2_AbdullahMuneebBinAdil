public class Move implements Action {
    private GameState gameState;
    private Door door;

    public Move(GameState gameState, Door door) {
        this.gameState = gameState;
        this.door = door;
    }

    @Override
    public String getDescription() {
        return "Move through door to " + door.getLeadsTo().getName();
    }

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


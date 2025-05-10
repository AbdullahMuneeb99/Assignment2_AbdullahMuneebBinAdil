public class Pick implements Action {
    private Character player;
    private Chamber chamber;
    private Item item;

    public Pick(Character player, Chamber chamber, Item item) {
        this.player = player;
        this.chamber = chamber;
        this.item = item;
    }

    @Override
    public String getDescription() {
        return "Pick up " + item;
    }

    @Override
    public void execute() {
        player.pickUpItem(item);
        chamber.getItems().remove(item);
        System.out.println("You picked up: " + item);
    }
}


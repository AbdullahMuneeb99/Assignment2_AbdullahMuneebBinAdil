public class FightAction implements Action {
    private Character player;
    private Door door;

    public FightAction(Character player, Door door) {
        this.player = player;
        this.door = door;
    }

    @Override
    public String getDescription() {
        return "Fight " + door.getGuardian();
    }

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


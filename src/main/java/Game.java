/**
 * Main game runner that initializes and runs the dungeon adventure.
 */
public class Game {
    /**
     * Entry point of the game.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // initialize some chambers
        Chamber[] chambers = new Chamber[] {
                new Chamber("Entry"),
                new Chamber("Axe Room"),
                new Chamber("Shield Room"),
                new Chamber("Spider Room"),
                new Chamber("Goal Room")
        };

        chambers[1].addItem(new Item("Axe", 2, 0));
        chambers[2].addItem(new Item("Shield", 0, 2));

        // connect the chambers with doors
        chambers[0].addDoor(new Door(chambers[1]));
        chambers[1].addDoor(new Door(chambers[2], new Monster("Goblin", 1, 0, 3)));
        chambers[2].addDoor(new Door(chambers[3], new Monster("Spider", 3, 0, 5)));
        chambers[3].addDoor(new Door(chambers[4]));

        // initialize player
        Character player = new Wizard("Gandalf", 2, 5, 10);

        // initialize the dungeon with player, entry chamber, and goal chamber
        Dungeon d = new Dungeon();
        d.setStartChamber(chambers[0]);
        d.setGoalChamber(chambers[4]);
        for (Chamber c : chambers) {
            d.addChamber(c);
        }

        TextUI ui = new TextUI();
        ui.play(d);
    }
}

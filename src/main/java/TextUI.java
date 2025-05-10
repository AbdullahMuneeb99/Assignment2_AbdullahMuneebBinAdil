import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Provides a text-based user interface for playing the dungeon game.
 */
public class TextUI {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Starts and manages the gameplay loop.
     *
     * @param dungeon the dungeon to play through
     */
    public void play(Dungeon dungeon) {
        GameState state = new GameState(new Wizard("Gandalf", 2, 5, 10), dungeon.getStartChamber());
        Character player = state.getPlayer();

        System.out.println("Welcome to the Dungeon!");
        while (player.isAlive() && !dungeon.isGoalChamber(state.getCurrentChamber())) {
            Chamber current = state.getCurrentChamber();
            System.out.println("\nYou are in " + current.getName());

            List<Action> actions = getAvailableActions(state, dungeon);

            for (int i = 0; i < actions.size(); i++) {
                System.out.println((i + 1) + ". " + actions.get(i).getDescription());
            }

            System.out.print("Choose an action: ");
            int choice = scanner.nextInt();
            if (choice > 0 && choice <= actions.size()) {
                actions.get(choice - 1).execute();
            } else {
                System.out.println("Invalid choice.");
            }
        }

        if (player.isAlive()) {
            System.out.println("Congratulations! You reached the goal chamber!");
        } else {
            System.out.println("You have perished in the dungeon...");
        }
    }

    /**
     * Gets a list of available actions for the current game state.
     *
     * @param state   the current game state
     * @param dungeon the dungeon being played
     * @return list of available actions
     */
    private List<Action> getAvailableActions(GameState state, Dungeon dungeon) {
        List<Action> actions = new java.util.ArrayList<>();
        Character player = state.getPlayer();
        Chamber chamber = state.getCurrentChamber();

        for (Item item : new ArrayList<>(chamber.getItems())) {
            actions.add(new Pick(player, chamber, item));
        }

        for (Door door : chamber.getDoors()) {
            if (door.isBlocked()) {
                actions.add(new FightAction(player, door));
            } else {
                actions.add(new Move(state, door));
            }
        }

        return actions;
    }
}


/**
 * Handles the logic for combat between a player character and a monster.
 */
public class Fight {
    private static final java.util.Random rand = new java.util.Random();

    /**
     * Executes a fight round between the player and the monster.
     * Rolls dice, compares stats, and applies damage accordingly.
     *
     * @param player  the player's character
     * @param monster the monster to fight
     */
    public static void execute(Character player, Monster monster) {
        int playerRoll = rand.nextInt(6) + 1;
        int monsterRoll = rand.nextInt(6) + 1;

        boolean monsterUsesStrength = monster.usesStrength();
        int playerStat = monsterUsesStrength ? player.getEffectiveStrength() : player.getEffectiveCraft();
        int monsterStat = monster.getPower();

        int playerTotal = playerRoll + playerStat;
        int monsterTotal = monsterRoll + monsterStat;

        int damage = Math.abs(playerTotal - monsterTotal);

        if (playerTotal > monsterTotal) {
            monster.reduceHealth(damage);
            System.out.println("You hit the monster for " + damage + " damage!");
        } else if (monsterTotal > playerTotal) {
            player.reduceHealth(damage);
            System.out.println("The monster hit you for " + damage + " damage!");
        } else {
            System.out.println("It's a tie. No damage dealt.");
        }

        System.out.println("Player HP: " + player.getHealth());
        System.out.println(monster.getName() + " HP: " + monster.getHealth());
    }
}

import java.util.Random;

public class Fight {
    private static final Random rand = new Random();

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
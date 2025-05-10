/**
 * Represents a monster that can use strength or craft in combat.
 */
public class Monster {
    private String name;
    private int strength;
    private int craft;
    private int health;

    /**
     * Constructs a Monster.
     */
    public Monster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }

    /**
     * Returns true if monster uses strength in combat.
     */
    public boolean usesStrength() {
        return strength > 0;
    }

    /**
     * Returns the combat power used (either strength or craft).
     */
    public int getPower() {
        return usesStrength() ? strength : craft;
    }

    /**
     * Reduces the monster's health.
     */
    public void reduceHealth(int amount) {
        health -= amount;
    }

    /**
     * Returns true if the monster is still alive.
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Returns the monster's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the monster's current health.
     */
    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ", " + (usesStrength() ? "Str: " + strength : "Craft: " + craft) + ")";
    }
}


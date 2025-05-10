public class Monster {
    private String name;
    private int strength;
    private int craft;
    private int health;

    public Monster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }

    public boolean usesStrength() {
        return strength > 0;
    }

    public int getPower() {
        return usesStrength() ? strength : craft;
    }

    public void reduceHealth(int amount) {
        health -= amount;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ", " + (usesStrength() ? "Str: " + strength : "Craft: " + craft) + ")";
    }
}


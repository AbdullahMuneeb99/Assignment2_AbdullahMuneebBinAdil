import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class representing a game character with stats and inventory.
 */
public abstract class Character {
    protected String name;
    protected int strength;
    protected int craft;
    protected int health;
    protected List<Item> inventory;
    protected Item mainHand;
    protected Item offHand;

    /**
     * Constructs a Character with given stats.
     */
    public Character(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    /**
     * Adds an item to the character's inventory.
     */
    public void pickUpItem(Item item) {
        inventory.add(item);
    }

    /**
     * Equips an item in the main hand if it's in the inventory.
     */
    public void useItemInMainHand(Item item) {
        if (inventory.contains(item)) {
            mainHand = item;
        }
    }

    /**
     * Equips an item in the off-hand if it's in the inventory.
     */
    public void useItemInOffHand(Item item) {
        if (inventory.contains(item)) {
            offHand = item;
        }
    }

    /**
     * Sets an item in either the main or off-hand.
     */
    public void setItemInHand(Item item, String hand) {
        if ("main".equalsIgnoreCase(hand)) {
            this.mainHand = item;
        } else if ("off".equalsIgnoreCase(hand)) {
            this.offHand = item;
        }
    }

    /**
     * Gets the item equipped in the specified hand.
     */
    public Item getItemInHand(String hand) {
        if ("main".equalsIgnoreCase(hand)) return mainHand;
        if ("off".equalsIgnoreCase(hand)) return offHand;
        return null;
    }

    /**
     * Returns the effective strength including equipped items.
     */
    public int getEffectiveStrength() {
        int total = strength;
        if (mainHand != null) total += mainHand.getStrength();
        if (offHand != null) total += offHand.getStrength();
        return total;
    }

    /**
     * Returns the effective craft including equipped items.
     */
    public int getEffectiveCraft() {
        int total = craft;
        if (mainHand != null) total += mainHand.getCraft();
        if (offHand != null) total += offHand.getCraft();
        return total;
    }

    /**
     * Reduces the character's health.
     */
    public void reduceHealth(int amount) {
        health -= amount;
    }

    /**
     * Returns the current health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Checks if the character is alive.
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Returns the character's inventory.
     */
    public List<Item> getInventory() {
        return inventory;
    }

    /**
     * Returns the character's name.
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ", Str: " + strength + ", Craft: " + craft + ")";
    }
}

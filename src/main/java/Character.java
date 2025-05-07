import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    protected String name;
    protected int strength;
    protected int craft;
    protected int health;
    protected List<Item> inventory;
    protected Item mainHand;
    protected Item offHand;

    public Character(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
        this.inventory = new ArrayList<>();
    }

    public void pickUpItem(Item item) {
        inventory.add(item);
    }

    public void useItemInMainHand(Item item) {
        if (inventory.contains(item)) {
            mainHand = item;
        }
    }

    public void useItemInOffHand(Item item) {
        if (inventory.contains(item)) {
            offHand = item;
        }
    }

    public int getEffectiveStrength() {
        int total = strength;
        if (mainHand != null) total += mainHand.getStrength();
        if (offHand != null) total += offHand.getStrength();
        return total;
    }

    public int getEffectiveCraft() {
        int total = craft;
        if (mainHand != null) total += mainHand.getCraft();
        if (offHand != null) total += offHand.getCraft();
        return total;
    }

    public void reduceHealth(int amount) {
        health -= amount;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (HP: " + health + ", Str: " + strength + ", Craft: " + craft + ")";
    }
}

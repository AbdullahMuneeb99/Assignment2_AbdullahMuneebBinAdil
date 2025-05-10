/**
 * Represents an item that can boost strength or craft.
 */
public class Item {
    private String name;
    private int strength;
    private int craft;

    /**
     * Constructs an item with strength and craft bonuses.
     */
    public Item(String name, int strength, int craft) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
    }

    /**
     * Returns the item's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the strength bonus of the item.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Returns the craft bonus of the item.
     */
    public int getCraft() {
        return craft;
    }

    @Override
    public String toString() {
        return name + " (Str: " + strength + ", Craft: " + craft + ")";
    }
}


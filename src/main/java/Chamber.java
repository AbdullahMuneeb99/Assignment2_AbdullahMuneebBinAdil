import java.util.ArrayList;
import java.util.List;

/**
 * Represents a room in the dungeon that can contain items and doors.
 */
public class Chamber {
    private String name;
    private List<Item> items;
    private List<Door> doors;

    /**
     * Constructs a chamber with the given name.
     *
     * @param name the name of the chamber
     */
    public Chamber(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.doors = new ArrayList<>();
    }

    /**
     * Adds an item to the chamber.
     *
     * @param item the item to add
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Adds a door to the chamber.
     *
     * @param door the door to add
     */
    public void addDoor(Door door) {
        doors.add(door);
    }

    /**
     * Returns the name of the chamber.
     *
     * @return chamber name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the list of items in the chamber.
     *
     * @return item list
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Returns the list of doors in the chamber.
     *
     * @return door list
     */
    public List<Door> getDoors() {
        return doors;
    }

    /**
     * Returns a string representation of the chamber.
     *
     * @return string description
     */
    @Override
    public String toString() {
        return "Chamber: " + name;
    }
}



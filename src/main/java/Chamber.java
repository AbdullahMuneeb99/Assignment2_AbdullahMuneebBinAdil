import java.util.ArrayList;
import java.util.List;

public class Chamber {
    private String name;
    private List<Item> items;
    private List<Door> doors;

    public Chamber(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.doors = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Door> getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Chamber: " + name;
    }
}


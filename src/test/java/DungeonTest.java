import org.junit.Test;
import static org.junit.Assert.*;

public class DungeonTest {

    @Test
    public void testDoorConnectivity() {
        Chamber a = new Chamber("A");
        Chamber b = new Chamber("B");

        Door ab = new Door(b);
        Door ba = new Door(a);

        a.addDoor(ab);
        b.addDoor(ba);

        assertEquals("B", a.getDoors().get(0).getLeadsTo().getName());
        assertEquals("A", b.getDoors().get(0).getLeadsTo().getName());
    }

    @Test
    public void testBlockedAndUnblockedDoor() {
        Chamber a = new Chamber("A");
        Chamber b = new Chamber("B");
        Monster m = new Monster("Spider", 5, 0, 10);
        Door ab = new Door(b, m);

        a.addDoor(ab);
        assertTrue(ab.isBlocked());

        m.reduceHealth(10);  // kill the monster
        assertFalse(ab.isBlocked());
    }
}


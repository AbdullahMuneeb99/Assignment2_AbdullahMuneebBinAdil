import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for dungeon components including chambers and doors.
 */
public class DungeonTest {

    /**
     * Tests that doors correctly connect two chambers.
     */
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

    /**
     * Tests whether a door is blocked by a monster and becomes unblocked when the monster is defeated.
     */
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


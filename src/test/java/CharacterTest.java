import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the Character class and its subclasses.
 * Tests focus on item pickup, equipping items, and stat calculations.
 */

public class CharacterTest {

    /**
     * Tests whether a character can pick up an item and store it in inventory.
     */
    @Test
    public void testPickUpItem() {
        Character warrior = new Warrior("Arin", 10, 5, 30);
        Item sword = new Item("Sword", 5, 0);
        warrior.pickUpItem(sword);
        assertTrue(warrior.getInventory().contains(sword));
    }

    /**
     * Tests if an item can be equipped to the character's hand correctly.
     */
    @Test
    public void testSetItemInHand() {
        Character wizard = new Wizard("Mira", 4, 8, 25);
        Item wand = new Item("Wand", 0, 5);
        wizard.pickUpItem(wand);
        wizard.setItemInHand(wand, "main");
        assertEquals(wand, wizard.getItemInHand("main"));
    }

    /**
     * Tests whether the character's effective stats are calculated properly with an equipped item.
     */
    @Test
    public void testEffectiveStatsWithItems() {
        Character warrior = new Warrior("Test", 10, 3, 30);
        Item axe = new Item("Axe", 4, 0);
        warrior.pickUpItem(axe);
        warrior.setItemInHand(axe, "main");

        assertEquals(14, warrior.getEffectiveStrength());
        assertEquals(3, warrior.getEffectiveCraft());
    }
}




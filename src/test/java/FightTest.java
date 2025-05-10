import org.junit.Test;
import static org.junit.Assert.*;

public class FightTest {

    @Test
    public void testMonsterCanBeDefeated() {
        Character warrior = new Warrior("Hero", 10, 2, 30);
        Monster goblin = new Monster("Goblin", 2, 0, 1);  // low health
        Fight.execute(warrior, goblin);
        assertFalse(goblin.isAlive());
    }

    @Test
    public void testPlayerCanTakeDamage() {
        Character wizard = new Wizard("Mira", 2, 2, 10);
        Monster spider = new Monster("Spider", 0, 5, 20);
        Fight.execute(wizard, spider);
        assertTrue(wizard.getHealth() < 10);
    }
}



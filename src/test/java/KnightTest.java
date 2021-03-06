import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {
    Knight testKnight = new Knight();
    Hobbit braveWarrior = new Hobbit();

    @Test
    public void kickStrongWarrior() throws Exception {
        int knightPower = testKnight.getPower();
        braveWarrior.setHp(knightPower + 1);
        testKnight.kick(braveWarrior);
        assertTrue(braveWarrior.isAlive());

    }

    @Test
    public void kickWeakWarrior() throws Exception {
        braveWarrior.setHp(1);
        testKnight.kick(braveWarrior);
        assertFalse(braveWarrior.isAlive());
    }

}
import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    King testKing = new King();
    Elf poorPeasent = new Elf();

    @Test
    public void kickPrettyStrongPeasent() throws Exception {
        int kingPower = testKing.getPower();
        poorPeasent.setHp(kingPower + 3);
        testKing.kick(poorPeasent);
        assertTrue(poorPeasent.getHp() >= 3);
    }

    @Test
    public void kickPreallyWeakPeasent() throws Exception {
        poorPeasent.setHp(4);
        testKing.kick(poorPeasent);
        assertFalse(poorPeasent.isAlive());
    }
}
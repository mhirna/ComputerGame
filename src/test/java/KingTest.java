import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {
    King testKing = new King();
    Elf poorPeasent = new Elf();

    @Test
    public void kickPrettyStrongPeasent() throws Exception {
        int kingHp = testKing.getHp();
        poorPeasent.setHp(kingHp + 3);
        System.out.println(poorPeasent.getHp());
        testKing.kick(poorPeasent);
        assertTrue(poorPeasent.getHp() >= 3);
    }

    @Test
    public void kickPreallyWeakPeasent() throws Exception {
        int kingHp = testKing.getHp();
        poorPeasent.setHp(4);
        testKing.kick(poorPeasent);
        assertFalse(poorPeasent.isAlive());
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class HobbitTest {
    Hobbit hobbitTest = new Hobbit();
    Hobbit hobbitToKick = new Hobbit();

    @Test
    public void getCryTest() throws Exception {
        assertFalse(hobbitTest.getCry());
    }

    @Test
    public void setHpTest() throws Exception {
        int startHp = hobbitTest.getHp();
        hobbitTest.setHp(startHp + 5);
        assertTrue(hobbitTest.getHp() - startHp == 5);
    }

    @Test
    public void getPowerTest() throws Exception {
        assertTrue(hobbitTest.getPower() == 0);
    }

    @Test
    public void TestCryBeforeKickTest() throws Exception {
        assertFalse(hobbitTest.getCry());
    }

    @Test
    public void TestCryAfterKick() throws Exception {
        hobbitTest.kick(hobbitToKick);
        assertTrue(hobbitTest.getCry());
    }
}
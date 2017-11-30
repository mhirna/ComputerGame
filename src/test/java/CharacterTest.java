import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class CharacterTest {
    Character someCharacterTest = new Character(3, 5) {
        @Override
        void kick(Character c) {
            System.out.println("Change some character hp");
        }
    };

    Character someOtherCharecter = new Character(1, 2) {
        @Override
        void kick(Character c) {
            System.out.println("Change other character hp");
        }
    };

    @Test
    public void setPowerTest() throws Exception {
        int startPower = someCharacterTest.getPower();
        someCharacterTest.setPower(startPower + 10);
        assertTrue(someCharacterTest.getPower() - startPower == 10);
    }

    @Test
    public void setHpTest() throws Exception {
        int startHp = someCharacterTest.getHp();
        someCharacterTest.setHp(startHp + 5);
        assertTrue(someCharacterTest.getHp() - startHp == 5);
    }

    @Test
    public void getPowerTest() throws Exception {
        assertTrue(someCharacterTest.getPower() == 3);
    }

    @Test
    public void getHpTest() throws Exception {
        assertTrue(someCharacterTest.getHp() == 5);
    }

    @Test
    public void isAliveTest() throws Exception {
        someCharacterTest.setHp(0);
        assertFalse(someCharacterTest.isAlive());
    }

    @Test
    public void kick() throws Exception {
        someOtherCharecter.setHp(5);
        someCharacterTest.setHp(5);
        someCharacterTest.kick(someOtherCharecter);
        assertTrue(someCharacterTest.isAlive() && someOtherCharecter.isAlive());
    }

}
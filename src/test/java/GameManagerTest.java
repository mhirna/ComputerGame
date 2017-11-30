import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    GameManager startGame = new GameManager();
    Elf fighterElf = new Elf();
    Hobbit fighterHobbit = new Hobbit();
    King fighterKing = new King();
    Knight fighterKnight = new Knight();

    @Test
    public void ElfVsHobbit() throws Exception {
        startGame.fight(fighterElf, fighterHobbit);
        assertTrue(fighterElf.isAlive() || fighterHobbit.isAlive());
        assertFalse(fighterElf.isAlive() && fighterHobbit.isAlive());
    }

    @Test
    public void ElfVsKing() throws Exception {
        startGame.fight(fighterElf, fighterKing);
        assertTrue(fighterElf.isAlive() || fighterKing.isAlive());
        assertFalse(fighterElf.isAlive() && fighterKing.isAlive());
    }

    @Test
    public void ElfVsKnight() throws Exception {
        startGame.fight(fighterElf, fighterKnight);
        assertTrue(fighterElf.isAlive() || fighterKnight.isAlive());
        assertFalse(fighterElf.isAlive() && fighterKnight.isAlive());
    }

    @Test
    public void HobbitVsKnight() throws Exception {
        startGame.fight(fighterHobbit, fighterKnight);
        assertTrue(fighterHobbit.isAlive() || fighterKnight.isAlive());
        assertFalse(fighterHobbit.isAlive() && fighterKnight.isAlive());
    }

    @Test
    public void HobbitVsKing() throws Exception {
        startGame.fight(fighterHobbit, fighterKing);
        assertTrue(fighterHobbit.isAlive() || fighterKing.isAlive());
        assertFalse(fighterHobbit.isAlive() && fighterKing.isAlive());
    }


    @Test
    public void KnightVsKing() throws Exception {
        startGame.fight(fighterKnight, fighterKing);
        assertTrue(fighterKnight.isAlive() || fighterKing.isAlive());
        assertFalse(fighterKnight.isAlive() && fighterKing.isAlive());
    }
}
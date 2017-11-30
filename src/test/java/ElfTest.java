import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    Elf elfTest = new Elf();
    Elf strongerElf = new Elf();
    Elf weakerElf = new Elf();

    @Test
    public void kickStronger() throws Exception {
        int startHp = elfTest.getHp();
        strongerElf.setHp(elfTest.getHp() + 5);
        elfTest.kick(strongerElf);
        assertTrue(elfTest.getHp() < startHp);
    }

    @Test
    public void kickWeaker() throws Exception{
        int startHp = elfTest.getHp();
        weakerElf.setHp(elfTest.getHp() - 1);
        elfTest.kick(weakerElf);
        assertTrue(weakerElf.getHp() == 0);
    }

}
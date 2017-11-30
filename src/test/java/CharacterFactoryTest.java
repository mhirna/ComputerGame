import com.sun.deploy.util.ArrayUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    CharacterFactory factoryTest = new CharacterFactory();
    List<String> allCharacters = Arrays.asList("Hobbit", "Elf", "King", "Knight");

    @Test
    public void createCharacterTest() throws Exception {
        Character characterTest = factoryTest.createCharacter();
        assertTrue(allCharacters.contains(characterTest.getClass().getName()));
    }

}
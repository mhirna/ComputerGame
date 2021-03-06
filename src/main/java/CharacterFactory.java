import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public class CharacterFactory {
    List<String> allCharacters = Arrays.asList("Hobbit", "Elf", "King", "Knight");
    Character createCharacter() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String randomCharacter = allCharacters.get((int) Math.random() * 4);
        Class characterClass = Class.forName(randomCharacter);
        Character ch = (Character) characterClass.newInstance();
        return ch;
    }
}
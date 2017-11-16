import java.util.Random;

public class King extends Character{
    protected int min = 5;
    private static int max = 15;
    private Random rand = new Random();

    public King(){
        hp = rand.nextInt(max - min + 1) + min;
        power = rand.nextInt(max - min + 1) + min;
    }

    void kick(Character c){
        int reduce = rand.nextInt(max - min + 1) + min;
        if (c.hp > reduce){
            c.hp -= reduce;
        }
        else {
            c.hp = 0;
        }
    }

}

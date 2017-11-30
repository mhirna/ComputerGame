import java.util.Random;

public class Knight extends Character{
    protected int min = 2;
    private static int max = 12;
    private Random rand = new Random();

    public Knight(){
        hp = rand.nextInt(max - min + 1) + min;
        power = rand.nextInt(max - min + 1) + min;
    }

    void kick(Character c){
        int reduce = rand.nextInt(this.power - min + 1) + min;
        if (c.hp > reduce){
            c.hp -= reduce;
        }
        else {
            c.hp = 0;
        }
    }

}

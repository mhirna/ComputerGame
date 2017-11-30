import java.util.Random;

public class King extends Character{
    protected int min = 5;
    private static int max = 15;
    private Random rand = new Random();

    public King(){
        this.hp = rand.nextInt(max - min + 1) + min;
        this.power = rand.nextInt(max - min + 1) + min;
    }

    void kick(Character c){
        int reduce = rand.nextInt(this.power - min + 1) + min;
        System.out.println(reduce);
        if (c.hp > reduce){
            c.hp -= reduce;
        }
        else {
            c.hp = 0;
        }
    }

}

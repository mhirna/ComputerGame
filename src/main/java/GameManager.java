import java.util.Random;

public class GameManager {
    private Random rand = new Random();

    void fight(Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            int c1Luck = rand.nextInt();
            int c2Luck = rand.nextInt();
            if (c1Luck > c2Luck){
                c1.kick(c2);
                System.out.println(c1.getClass().getName() + " just got kicked!");
            }

            else{
                c2.kick(c1);
                System.out.println(c1.getClass().getName() + " just got kicked!");

            }
            System.out.println("hp of " + c1.getClass().getName() + " is "+ c1.getHp());
            System.out.println("hp of " + c2.getClass().getName() + " is " + c2.getHp());
        }
        if (c1.isAlive()){
            System.out.println("The winner is " + c1.getClass().getName());
        }
        else {
            System.out.println("The winner is " + c2.getClass().getName());
        }
    }
}
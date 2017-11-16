import java.util.Random;

public class GameManager {
    private Random rand = new Random();

    void fight(Character c1, Character c2){
        while (c1.isAlive() && c2.isAlive()){
            int c1Luck = rand.nextInt();
            int c2Luck = rand.nextInt();
            if (c1Luck > c2Luck){
                c1.kick(c2);
                System.out.println("Player 2 just got kicked!");
            }

            else{
                c2.kick(c1);
                System.out.println("Player 1 just got kicked!");

            }
            System.out.println("hp of player 1 is " + c1.getHp());
            System.out.println("hp of player 2 is " + c2.getHp());
        }
    }
}
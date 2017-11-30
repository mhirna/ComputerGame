
public class Elf extends Character{

    public Elf(){
        this.hp = 10;
        this.power = 10;
    }

    void kick(Character c){
        if (c.getHp() < this.hp){
            c.hp = 0;
        }
        else {
            this.hp--;
        }
    }
}
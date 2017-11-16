public class Elf extends Character{
    public Elf(){
        hp = 10;
        power = 10;
    }

    void kick(Character c){
        if (c.hp < this.hp){
            c.hp = 0;
        }
        else {
            this.hp--;
        }
    }
}
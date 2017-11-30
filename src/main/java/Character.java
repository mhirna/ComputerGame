
public abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }

    protected Character() {
    }

    public int getPower() {
        return power;
    }

    public int getHp(){
        return hp;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive(){
        if (this.hp > 0){
            return true;
        }
        return false;
    }

    abstract void kick(Character c);
}
public class Hobbit extends Character{
    private boolean cry = false;

    public Hobbit() {
        hp = 3;
        power = 0;
    }
    void kick(Character c) {
        cry = true;
    }
}

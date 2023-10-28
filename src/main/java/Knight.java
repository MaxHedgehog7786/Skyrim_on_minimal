public class Knight extends Unit {
    public Knight(String name) {
        super(name);
        health = 100;
    }

    @Override
    public void getDamage(int damage) {
        super.getDamage(damage*CCR.coin());
    }
}

public class play {
    public static void main(String[] args) {

        Wizard wizard1 = new Wizard("wizard1");

        Knight knight1 = new Knight("knight1");
        knight1.getDamage(wizard1.att);
    }
}

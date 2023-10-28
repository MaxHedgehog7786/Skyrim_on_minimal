public class Wizard extends Unit{
    public Wizard(String name) {
        super(name);
        health = 70;
        damage = 25;
    }
    protected int mana = 100;

    @Override
    public int attack() {
        if(mana>=10) {
            super.attack();
            mana-=10;
        }
    }



    public void regen(){
        if (mana>=30){
            mana-=30;
            health+=15;
        }
    }
}

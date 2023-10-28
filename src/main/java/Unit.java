public abstract class Unit {
    protected String name;
    public Unit(String name) {
        this.name = name;
    }
    protected int health = 100;
    protected int damage = 10;

    @Override
    public String toString() {
        return "unit{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }


    public int attack(){
        return this.damage;
    }
    public void getDamage(int damage){
        this.health-=damage;
    }
    public abstract void attack(Unit unit);
}

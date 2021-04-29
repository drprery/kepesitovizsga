package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {
    protected int hitPoints;
    protected int damage;
    protected boolean armor;

    public MilitaryUnit(int hitPoints, int damage, boolean armor){
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armor = armor;
    }

    public abstract int doDamage();


    public abstract void sufferDamage(int damage);

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isArmor() {
        return armor;
    }
}

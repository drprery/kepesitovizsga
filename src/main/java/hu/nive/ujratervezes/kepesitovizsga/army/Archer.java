package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit{
    public Archer(){
        super(50, 20, false);
    }

    @Override
    public void sufferDamage(int damage) {
        this.hitPoints-=damage;
    }

    public int doDamage(){
        return damage;
    }
}

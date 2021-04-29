package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{
    private int attackCount;

    public HeavyCavalry(){
        super(150, 20, true);
    }

    public void sufferDamage(int damage) {
        this.hitPoints-=damage/2;
    }

    public int doDamage(){
        attackCount++;
        if(attackCount==1){
            return this.damage * 3;
        } else {
            return this.damage;
        }

    }
}

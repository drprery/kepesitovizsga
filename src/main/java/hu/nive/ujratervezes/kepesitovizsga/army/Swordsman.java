package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{
    private boolean shield = true;

    public Swordsman(boolean armor){
        super(100,10, armor);
    }

    public void sufferDamage(int damage) {

        if (shield == true) {
            shield = false;
            return;
        }
        if (shield == false) {
            if (armor == true) {
                this.hitPoints -= damage / 2;
            } else {
                this.hitPoints -= damage;
            }
        }
    }

    public int doDamage(){
        return damage;
    }
}

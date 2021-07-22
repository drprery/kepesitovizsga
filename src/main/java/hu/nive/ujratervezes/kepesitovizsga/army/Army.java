package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<MilitaryUnit> militaryUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit){
        militaryUnits.add(militaryUnit);
    }

    public void damageAll(int damage){
        militaryUnits.forEach(n -> n.sufferDamage(damage));
        militaryUnits.removeIf(n -> n.getHitPoints()<25);
    }

    public int getArmyDamage() {
        int armyDamage = 0;
        for (MilitaryUnit unit : militaryUnits) {
            armyDamage += unit.doDamage();
        }
        return armyDamage;
    }

    public int getArmySize(){
        return militaryUnits.size();
    }
}

package patterns.behavioral.strategy;

import patterns.behavioral.state.Mage1;

public class HealStrategy implements Strategy{
    @Override
    public void execute(Mage1 mage, Mage1 mage1) {
        if (mage.getStamina() > 0) {
            mage1.setHp(mage1.getHp()+15);
            mage.setStamina(mage.getStamina()-5);
        } else {
            System.out.println("-stamina");
        }
    }
}

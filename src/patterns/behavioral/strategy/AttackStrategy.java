package patterns.behavioral.strategy;

import patterns.behavioral.state.Mage1;

public class AttackStrategy implements Strategy{

    @Override
    public void execute(Mage1 mage, Mage1 mage1) {
        mage1.setHp(mage1.getHp() - mage.getDamage());
    }
}

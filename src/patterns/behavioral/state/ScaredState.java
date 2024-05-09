package patterns.behavioral.state;

public class ScaredState extends State{

    @Override
    public void currentState(Mage1 mage) {
        mage.setDamage(mage.getDamage()-10);
    }
}

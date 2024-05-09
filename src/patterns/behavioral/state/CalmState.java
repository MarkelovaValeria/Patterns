package patterns.behavioral.state;

public class CalmState extends State{

    @Override
    public void currentState(Mage1 mage) {
        mage.setDamage(20);
    }
}

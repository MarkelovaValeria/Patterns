package patterns.behavioral.state;

public abstract class State {

    public abstract void currentState(Mage1 mage);
    public void changeOfState(Mage1 mage1, State state){
        mage1.setState(state);
    };
}

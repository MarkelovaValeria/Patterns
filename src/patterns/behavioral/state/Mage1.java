package patterns.behavioral.state;

import patterns.behavioral.strategy.Strategy;

public class Mage1 {
    private String name;
    private int damage;
    private int hp;
    private int stamina;
    private int defend;
    private State state;
    private Strategy strategy;

    public Mage1(String name, int damage, int hp, int stamina, int defend){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.stamina = stamina;
        this.defend = defend;
        this.state = new CalmState();
    }



    public void changeState(State state) {
        this.state.changeOfState(this, state);
        this.state.currentState(this);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    public void executeStrategy(Mage1 mage){
        this.strategy.execute(this,mage);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}

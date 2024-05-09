package patterns.behavioral.command;

public class WildAnimal extends Animal{


    private int quantity;
    private String food;
    public WildAnimal(String name, int lvl, int hp, int quantity, String food) {
        super(name, lvl, hp);
        this.quantity = quantity;
        this.food = food;
    }

    public DomesticatedAnimal tame(){
        return new DomesticatedAnimal(this.getName(), this.getLvl(), this.getHp(), this);
    }
    public int getQuantity() {
        return quantity;
    }

    public String getFood() {
        return food;
    }
}

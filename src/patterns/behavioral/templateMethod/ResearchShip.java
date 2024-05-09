package patterns.behavioral.templateMethod;

import patterns.behavioral.chainOfResponsibility.Inventory;

public class ResearchShip extends Ship{
    private Inventory inventory;
    public ResearchShip(int hp, int defend) {
        super(hp, defend);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

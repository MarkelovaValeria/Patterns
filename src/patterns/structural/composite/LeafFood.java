package patterns.structural.composite;

public class LeafFood implements ComponentMapInfo{
    private String name;
    private String type;
    private int hpEffect;

    public LeafFood(String name, String type, int hpEffect){
        this.name = name;
        this.type = type;
        this.hpEffect = hpEffect;
    }
    @Override
    public void display() {
        System.out.println("Food" + "\nName:" + name + "\nType: " + type + "\nHp effect: " + hpEffect);
    }
}

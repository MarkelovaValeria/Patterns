package patterns.structural.flyweight;

public class Characteristic {
    private String name;

    private CommonCharacteristic common;

    public Characteristic(String name, CommonCharacteristic common){
        this.name = name;
        this.common = common;
    }


    public String getName() {
        return name;
    }

    public int getDamage(){
        return common.getDamage();
    }

    public int getLevel(){
        return common.getLevel();
    }
}

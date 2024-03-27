package patterns.structural.facade;

public class Character {
    private String type;
    private String appearance;
    private String ability;
    private String equipment;
    private int level;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Character:" +
                "\nType - " + type +
                "\nAppearance - " + appearance +
                "\nAbility - " + ability+
                "\nEquipment - " + equipment+
                "\nLevel - " + level +
                "\nName - " + name ;
    }
}

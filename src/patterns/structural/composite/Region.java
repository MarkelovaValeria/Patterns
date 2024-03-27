package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Region implements ComponentMapInfo{
    private String name;
    private int difficultLvl;
    private List<ComponentMapInfo> components = new ArrayList<>();

    public Region(String name, int lvl){
        this.name = name;
        this.difficultLvl = lvl;
    }
    public void add(ComponentMapInfo component) {
        components.add(component);
    }

    public void remove(ComponentMapInfo component){
        components.remove(component);
    }


    @Override
    public void display() {
        System.out.println(name + "\nLvl: " + difficultLvl);
        for (var component:components){
            component.display();
        }
    }
}

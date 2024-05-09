package patterns.behavioral.observer;

import patterns.behavioral.chainOfResponsibility.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Citizen {
    private String name;
    private int satisfaction;
    private int hp;
    private Inventory inventory;
    private Work work;
    private List<String> needs;



    public Citizen(String name, int hp, Work work){
        this.name = name;
        this.satisfaction = 50;
        this.hp = hp;
        this.work = work;
        this.needs = new ArrayList<>();
    }

    public void CheckEcology(Ecology ecology){
        if(ecology.getGreenZones()<=50){
            hp-=5;
            satisfaction -= 15;
        }else if(ecology.getGreenZones()>50){
            satisfaction += 5;
        }
        System.out.println("------------ " + name + " ------------"+"\nhp - " + hp + "\nsatisfaction - " + satisfaction + "\n---------------------");
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }
}

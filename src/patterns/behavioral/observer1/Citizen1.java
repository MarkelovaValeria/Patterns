package patterns.behavioral.observer1;

import patterns.behavioral.chainOfResponsibility.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Citizen1 implements CitizenObserver1 {
    private String name;
    private int satisfaction;
    private int hp;
    private Inventory inventory;
    private Work1 work;
    private List<String> needs;



    public Citizen1(String name, int hp, Work1 work){
        this.name = name;
        this.satisfaction = 50;
        this.hp = hp;
        this.work = work;
        this.needs = new ArrayList<>();
    }

    public void checkEcology(Ecology1 ecology){
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

    public Work1 getWork() {
        return work;
    }

    public void setWork(Work1 work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }


    @Override
    public void onCityMetricsChanged(Ecology1 ecology, Economy1 economy) {
        economy.updateEconomy(this, ecology);
        ecology.updateGreenZones();
        if(ecology.getGreenZones()< ecology.getEcology()&&economy.getIncome()< economy.getEconomy()){
            satisfaction -= 15;
        }else if(ecology.getGreenZones()< ecology.getEcology()||economy.getIncome()< economy.getEconomy()){
            satisfaction -= 5;
        }
        else if(ecology.getGreenZones()> ecology.getEcology()&&economy.getIncome()> economy.getEconomy()){
            satisfaction += 15;
        }
        else if(ecology.getGreenZones()>ecology.getEcology()||economy.getIncome()> economy.getEconomy()){
            satisfaction += 5;
        }
        if(satisfaction > 100) satisfaction = 100;
        else if(satisfaction < 0) satisfaction = 0;
    }

    @Override
    public int getCitizenSatisfaction() {

        return satisfaction;
    }
}

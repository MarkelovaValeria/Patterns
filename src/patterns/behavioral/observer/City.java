package patterns.behavioral.observer;


import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private int citizenSatisfaction;
    private int ecologicalState;

    private List<Citizen> citizens;
    private Ecology ecology;
    private Economy economy;

    public City(String name){
        this.name = name;
        this.citizens = new ArrayList<>();
        this.ecology = new Ecology();
        this.economy = new Economy();
    }


    public void addCitizen(Citizen citizen){
        citizens.add(citizen);
    }

    public void removeCitizen(Citizen citizen){
        citizens.remove(citizen);
    }

    public void updateCitizenSatisfaction(){
        for(Citizen citizen: citizens){
            if(citizen.getSatisfaction()>=50 && citizen.getSatisfaction()<80){
                citizenSatisfaction += 5;
            }
            else if(citizen.getSatisfaction()>=80){
                citizenSatisfaction +=10;
            }
            else if(citizen.getSatisfaction()<50 && citizen.getSatisfaction()>20){
                citizenSatisfaction -=2;
            }
            else{
                citizenSatisfaction -=10;
            }

            if(citizenSatisfaction < 0){
                citizenSatisfaction = 0;
            }
            else if(citizenSatisfaction > 100){
                citizenSatisfaction = 100;
            }

        }
    }

    public void updateEconomicDevelopment(){
        for(Citizen citizen:citizens){
            economy.updateEconomy(citizen,ecology);
            citizen.CheckEcology(ecology);
        }

    }

    public void updateEcologicalState(){
        ecology.updateGreenZones();
        if (ecology.getGreenZones()<=50){
            ecologicalState -=10;
        }else if(ecology.getGreenZones()>50){
            ecologicalState+=10;
        }
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    @Override
    public String toString() {
        return "citizenSatisfaction - " + citizenSatisfaction + "\necologicalState - " + ecologicalState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

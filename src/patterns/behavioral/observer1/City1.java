package patterns.behavioral.observer1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class City1 {
    private String name;
    private int citizenSatisfaction;
    private Ecology1 ecology1;
    private Economy1 economy1;

    private List<Citizen1> citizens;

    public City1(String name){
        this.name = name;

        this.citizens = new ArrayList<>();
        this.ecology1 = new Ecology1();
        this.economy1 = new Economy1();
    }


    public void addCitizen(Citizen1 citizen){
        citizens.add(citizen);
    }

    public void removeCitizen(Citizen1 citizen){
        citizens.remove(citizen);
    }

    public void updateCitizenSatisfaction(){
        for(Citizen1 citizen: citizens){
            citizen.onCityMetricsChanged(ecology1, economy1);
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

    public void checkSatisfaction(){
        if(citizenSatisfaction < 20){
            Random random = new Random();
            int numberOfCitizensToRemove = 2;
            for(int i = 0; i < numberOfCitizensToRemove && !citizens.isEmpty(); i++){
                int indexToRemove = random.nextInt(citizens.size());
                Citizen1 citizenToRemove = citizens.get(indexToRemove);
                citizens.remove(citizenToRemove);
                System.out.println("Removed citizen: " + citizenToRemove.getName());
            }
        }

    }



    public int getCitizenSatisfaction() {
        return citizenSatisfaction;
    }

    public void setCitizenSatisfaction(int citizenSatisfaction) {
        this.citizenSatisfaction = citizenSatisfaction;
    }

    public List<Citizen1> getCitizens() {
        return citizens;
    }

    @Override
    public String toString() {
        return "citizenSatisfaction - " + citizenSatisfaction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

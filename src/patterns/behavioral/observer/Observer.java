package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<City> cities;

    public Observer(){
        this.cities = new ArrayList<>();
    }

    public void addCity(City city){
        cities.add(city);
    }
    public void removeCity(City city){
        cities.remove(city);
    }

    public void updateCity(){
        for(City city : cities){
            city.updateCitizenSatisfaction();
            city.updateEconomicDevelopment();
            city.updateEcologicalState();
            System.out.println(city.toString());
            for (Citizen citizen : city.getCitizens()){
                System.out.println(citizen.getName() + " update city");
            }
        }

    }

}

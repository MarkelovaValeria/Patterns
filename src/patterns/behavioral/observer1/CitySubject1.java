package patterns.behavioral.observer1;

import java.util.ArrayList;
import java.util.List;

public class CitySubject1 {
    private List<City1> cities;

    public CitySubject1(){
        this.cities = new ArrayList<>();
    }

    public void addCity(City1 city){
        cities.add(city);
    }
    public void removeCity(City1 city){
        cities.remove(city);
    }

    public void updateCity(){
        for(City1 city : cities){
            city.updateCitizenSatisfaction();
            city.checkSatisfaction();
            System.out.println(city.toString()) ;

        }

    }

}

package CodeSmells.newLab6.part2.replaceArrayWithObject;

import java.util.List;

public class CarData {
    private List<Car> cars;

    public CarData(List<Car> cars){
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}

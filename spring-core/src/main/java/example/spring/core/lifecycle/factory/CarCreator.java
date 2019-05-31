package example.spring.core.lifecycle.factory;

import java.util.HashMap;
import java.util.Map;

public class CarCreator {
    private Map<String, Car> cars = new HashMap<>();

    public CarCreator()   {
        System.out.println("### init carCreator");

        Car car = new Bus("B370");
        cars.put(car.type(), car);
        car = new Sedan("S300");
        cars.put(car.type(), car);
        car = new Truck("T500");
        cars.put(car.type(), car);
    }

    public Car car(String type) {
        Car car = cars.get(type);
        if(car == null)     {
            throw new IllegalArgumentException("Unknown type. type: " + type);
        }

        return car;
    }
}

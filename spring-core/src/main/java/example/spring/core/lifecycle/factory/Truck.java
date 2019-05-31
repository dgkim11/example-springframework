package example.spring.core.lifecycle.factory;

public class Truck implements Car {
    private String TYPE = "truck";
    private String model;

    public Truck(String model)   {
        this.model = model;
    }
    @Override
    public String model() {
        return model;
    }

    @Override
    public String type() {
        return TYPE;
    }
}

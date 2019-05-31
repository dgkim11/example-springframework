package example.spring.core.lifecycle.factory;

public class Bus implements Car {
    private String TYPE = "bus";
    private String model;

    public Bus(String model)   {
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

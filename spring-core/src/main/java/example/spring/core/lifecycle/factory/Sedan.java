package example.spring.core.lifecycle.factory;

public class Sedan implements Car {
    private String TYPE = "sedan";
    private String model;

    public Sedan(String model)   {
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

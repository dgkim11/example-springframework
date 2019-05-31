package example.spring.core.lifecycle.factory;

import org.springframework.context.annotation.Bean;

public class FactoryBeanAppConfig {
    private CarCreator carCreator = new CarCreator();

    @Bean
    public Car bus()    {
        return carCreator.car("bus");
    }
    @Bean
    public Car truck()    {
        return carCreator.car("truck");
    }
    @Bean
    public Car sedan()    {
        return carCreator.car("sedan");
    }
}

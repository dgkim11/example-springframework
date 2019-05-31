package example.spring.core.lifecycle.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"example.spring.core.lifecycle.postprocessor"})
public class BeanPostProcessorAppConfig {
    @Bean
    public Sample1Bean sample1Bean()    {
        return new Sample1Bean();
    }

    @Bean
    public Sample2Bean sample2Bean()    {
        return new Sample2Bean();
    }
}

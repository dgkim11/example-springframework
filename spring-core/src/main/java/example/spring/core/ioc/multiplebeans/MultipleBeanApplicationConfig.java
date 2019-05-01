package example.spring.core.ioc.multiplebeans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"example.spring.core.ioc.multiplebeans"})
public class MultipleBeanApplicationConfig {
}

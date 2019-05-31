package example.spring.core.lifecycle.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"example.spring.core.lifecycle.aware"})
public class AwareInterfaceAppConfig {
}

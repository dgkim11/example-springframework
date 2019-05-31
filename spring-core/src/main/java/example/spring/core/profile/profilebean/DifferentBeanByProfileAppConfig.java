package example.spring.core.profile.profilebean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"example.spring.core.profile.profilebean.bean"})
public class DifferentBeanByProfileAppConfig {
}

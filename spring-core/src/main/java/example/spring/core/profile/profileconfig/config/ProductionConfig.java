package example.spring.core.profile.profileconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("production")
@Configuration
@PropertySource({ "classpath:profiles/application-production.properties" })
public class ProductionConfig {
}

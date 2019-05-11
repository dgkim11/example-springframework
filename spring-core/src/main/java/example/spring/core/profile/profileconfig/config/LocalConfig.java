package example.spring.core.profile.profileconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("local")
@Configuration
@PropertySource({ "classpath:profiles/application-local.properties" })
public class LocalConfig {
}

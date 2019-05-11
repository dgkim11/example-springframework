package example.spring.core.profile.profileconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * DevConfig 파일은 dev 환경에서 읽어들여야 하는 property 파일을 지정하고 Profile 어노테이션을 통해서 자신의 profile이 dev 임을
 * 지정하고 있다.
 */
@Profile("dev")
@Configuration
@PropertySource({ "classpath:profiles/application-dev.properties" })
public class DevConfig {
}

package example.spring.core.profile.getenv;

import example.spring.core.profile.DataPipelineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:profiles/application-${spring.profiles.active}.properties")
public class SpringProfileApplicationConfig {
    @Bean
    public DataPipelineService dataPipelineService()    {
        return new DataPipelineService();
    }
}

package example.spring.core.profile.profileconfig;

import example.spring.core.profile.DataPipelineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"example.spring.core.profile.profileconfig.config"})
public class BaseApplicationConfig {
    @Bean
    public DataPipelineService dataPipelineService()    {
        return new DataPipelineService();
    }
}

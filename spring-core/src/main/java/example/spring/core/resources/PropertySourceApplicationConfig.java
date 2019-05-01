package example.spring.core.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:property-source-ex.properties")
public class PropertySourceApplicationConfig {
    @Value("${readfile-name}")
    private String readFileName;
    @Value("${writefile-name}")
    private String writeFileName;

    @Bean
    public ScoreSummaryService scoreSummaryService()    {
        return new ScoreSummaryService(readFileName, writeFileName);
    }
    @Bean
    public BannerResourceLoader bannerResourceLoader()    {
        return new BannerResourceLoader();
    }
}

package example.spring.core.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 이 Config 클래스는 아래와 같이 두개의 properties 파일을 정의하였다. 만약에 이 두개의 파일이 동일한 키에 대해 서로 다른 값을 정의하였다면
 * 뒤에 등록된 properties 파일이 앞에 값을 override한다.
 */
@Configuration
@PropertySource({ "classpath:property-source-ex.properties", "classpath:property-source-ex-override.properties" })
public class PropertySourceApplicationOverrideConfig {
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

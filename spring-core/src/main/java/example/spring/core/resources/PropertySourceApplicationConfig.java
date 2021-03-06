package example.spring.core.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @PropertySource 어노테이션은 프로퍼티 소스의 위치를 알려준다. Config 클래스는 해당 파일에서 프로퍼티를 읽어들인다.
 * @Value 어노테이션을 통해서 프로퍼티 키에 대한 값을 변수에 할당하게 된다.
 */
@Configuration
@PropertySource({ "classpath:property-source-ex.properties" })
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

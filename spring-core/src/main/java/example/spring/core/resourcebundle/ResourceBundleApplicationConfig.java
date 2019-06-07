package example.spring.core.resourcebundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = {"example.spring.core.resourcebundle"})
public class ResourceBundleApplicationConfig {
    @Bean
    public ReloadableResourceBundleMessageSource messageSource()    {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        // 클래스 패스 상에 message-bundles 이라는 디렉토리 위치에서 prefix가 messages로 시작하는 메세지 리소스 번들을 찾으라는 뜻이다.
        messageSource.setBasename("classpath:message-bundles/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }
}

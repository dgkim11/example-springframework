package example.spring.mvc.config;

import example.spring.mvc.interceptor.MeasureProcessingTimeInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * Interceptor를 추가하는 configuration이다. Interceptor를 추가하기 위해서는 WebMvcConfigurer를 implement 받아서
 * addInterceptors() 메쏘드를 override해서 interceptor들을 추가한다.
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(measureProcessingTimeInterceptor());
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public MeasureProcessingTimeInterceptor measureProcessingTimeInterceptor()  {
        return new MeasureProcessingTimeInterceptor();
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor()    {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");
        return localeChangeInterceptor;
    }
}

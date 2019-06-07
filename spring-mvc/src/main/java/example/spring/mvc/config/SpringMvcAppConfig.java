package example.spring.mvc.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import com.github.jknack.handlebars.springmvc.MessageSourceHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = { "example.spring.mvc.controller"})
public class SpringMvcAppConfig {
    private static final String HANDLEBARS_VIEW_BASE_PATH = "/WEB-INF/views";
    private static final String HANDLEBARDS_VIEW_SUFFIX = ".hbs";

    /**
     * 여기 예제에서는 Handlebars를 이용해서 렌더링을 할 것이다. Handlebars를 이용하기 위해서는 3rd party에서 제공하는
     * Spring framework을 위한 Handlebars View Resolver를 생성하여야 한다. 그리고, view 파일들은
     * HANDLEBARS_VIEW_BASE_PATH 에 지정된 path에 넣는다. 파일 확장자는 HANDLEBARDS_VIEW_SUFFIX 이다.
     * @return
     */
    @Bean
    public HandlebarsViewResolver handlebarsViewResolver()  {
        HandlebarsViewResolver handlebarsViewResolver = new HandlebarsViewResolver();
        handlebarsViewResolver.setPrefix(HANDLEBARS_VIEW_BASE_PATH);
        handlebarsViewResolver.setSuffix(HANDLEBARDS_VIEW_SUFFIX);
        // 다국어 지원을 위해서 MessageSourceHelper를 등록한다.
        handlebarsViewResolver.registerHelper("i18n", new MessageSourceHelper(messageSource()));

        return handlebarsViewResolver;
    }

    @Bean
    public ReloadableResourceBundleMessageSource messageSource()    {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        // 클래스 패스 상에 resource-bundle 이라는 디렉토리 위치에서 prefix가 messages로 시작하는 메세지 리소스 번들을 찾으라는 뜻이다.
        messageSource.setBasename("classpath:resource-bundle/messages");
        messageSource.setDefaultEncoding("UTF-8");
        messageSource.setCacheSeconds(1);
        return messageSource;
    }

}

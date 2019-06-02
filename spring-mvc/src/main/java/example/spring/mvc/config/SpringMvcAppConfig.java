package example.spring.mvc.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
        return handlebarsViewResolver;
    }
}

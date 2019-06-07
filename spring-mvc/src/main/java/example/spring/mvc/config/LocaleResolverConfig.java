package example.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleResolverConfig {
    /**
     * 아래의 LocaleResolver 중에 하나만 사용되어야 한다. 따라서, 주석처리된 LocaleResolver를 확인해보고 싶다면 다른 나머지는
     * 모두 주석처리한 후에 확인해보도록 한다. Bean 이름은 반드시 'localeResolver'가 되어야 한다. Spring framework은 메쏘드 이름을
     * 디폴트로 bean 이름으로 지정하나 메쏘드 이름과 bean 이름이 다른 경우에는 명시적으로 bean name을 지정한다.
     * localeResolver로 아무것도 지정하지 않는 경우
     */
    @Bean("localeResolver")
    public LocaleResolver sessionLocaleResolver()  {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.KOREA);

        return localeResolver;
    }

    @Bean("localeResolver")
    public LocaleResolver cookieLocaleResolver()    {
        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
        cookieLocaleResolver.setCookieName("language");
        cookieLocaleResolver.setCookieMaxAge(3600);
        cookieLocaleResolver.setDefaultLocale(Locale.KOREA);

        return cookieLocaleResolver;
    }

}

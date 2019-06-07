package example.spring.mvc;

import example.spring.mvc.config.InterceptorConfiguration;
import example.spring.mvc.config.LocaleResolverConfig;
import example.spring.mvc.config.SpringMvcAppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringMvcAppConfig.class, InterceptorConfiguration.class, LocaleResolverConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}

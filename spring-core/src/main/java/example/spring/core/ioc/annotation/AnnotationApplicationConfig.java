package example.spring.core.ioc.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 여기서는 ComponentScan을 이용해서 Bean을 자동생성 하는 방식으로 Bean을 생성하였다. 이렇게 하려면
 * Bean 클래스는 @Component, @Service, @Repository, @Controller 등등의 어노테이션을 가져야 한다.
 */
@Configuration
@ComponentScan(basePackages = {"example.spring.core.ioc.annotation"})
public class AnnotationApplicationConfig {
}

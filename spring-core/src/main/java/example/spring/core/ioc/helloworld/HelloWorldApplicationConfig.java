package example.spring.core.ioc.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring framework에서 Bean을 정의하는 방법은 XML 파일을 이용하는 방법과 여기서처럼 Config class를 이용해서 Bean을 정의할 수 있다.
 * Config class는 @Configuration이라는 어노테이션을 달아야 한다. 그리고, Bean을 생성하는 메쏘드에 @Bean 어노테이션을 달아서
 * Bean을 정의하게 된다.
 */
@Configuration
public class HelloWorldApplicationConfig {
    @Bean
    public HelloWorldBean helloWorldBean()  {
        return new HelloWorldBean();
    }
}

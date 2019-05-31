package example.spring.core.lifecycle.construct;

import org.springframework.context.annotation.Bean;

/**
 * 여기서는 두개의 bean을 생성한다. Bean 어노테이션에서 bean이 생성될 때, 제거될 때 호출되어야 하는 메쏘드를 지정할 수 있다.
 * initMethod, destroyMethod가 거기에 해당한다. HelloBeanByDirect는 클래스 자체에 life cycle과 관련된 어느테이션을
 * 직접 메쏘드에 다는 방식을 썼기 때문에 여기서 아무런 작업을 해주지 않는다.
 */
public class BeanLifecycleAppConfig {
    @Bean(initMethod = "initBean", destroyMethod = "closeBean")
    public HelloBean helloBean()    {
        return new HelloBean();
    }

    @Bean
    public HelloBeanByDirect helloBeanByDirect()    {
        return new HelloBeanByDirect();
    }
}

package example.spring.core.lifecycle.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring은 xxxAware 라는 interface를 제공한다. 예로, BeanNameAware, BeanFactoryAware,
 * ApplicationContextAware, MessageSourceAware, etc 등등의 인터페이스를 제공하며 bean이 이러한 interface를 구현하는 경우
 * 해당 Bean에게 구현한 interface의 메쏘드를 호출해준다. Bean이 IoC 컨테이너와 직접적인 의존 관계를 가지는 것은
 * 바람직한 패턴이 아니다. 따라서, 어쩔 수 없이 써야하는 경우에만 제한적으로 이용하도록 한다.
 */
public class AwareInterfaceExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AwareInterfaceAppConfig.class);
        BeanNameAwareImplBean bean = applicationContext.getBean(BeanNameAwareImplBean.class);
        System.out.println(bean.read());
    }
}

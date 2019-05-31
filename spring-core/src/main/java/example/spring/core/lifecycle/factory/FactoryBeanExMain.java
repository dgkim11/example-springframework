package example.spring.core.lifecycle.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 빈을 생성할 때 어떤 생성 로직이 필요한 경우 factory 패턴을 이용해서 bean을 생성할 수 있다. 본 예제는 Factory 패턴을
 * 이용해서 bean을 생성하는 것을 보여준다.
 */
public class FactoryBeanExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(FactoryBeanAppConfig.class);
        Car bus = (Car)applicationContext.getBean("bus");
        System.out.println("type:" + bus.type() + ", model:" + bus.model());
        Car sedan = (Car)applicationContext.getBean("sedan");
        System.out.println("type:" + sedan.type() + ", model:" + sedan.model());
        Car truck = (Car)applicationContext.getBean("truck");
        System.out.println("type:" + truck.type() + ", model:" + truck.model());
    }
}

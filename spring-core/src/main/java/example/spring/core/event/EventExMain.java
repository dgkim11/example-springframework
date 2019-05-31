package example.spring.core.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring에서는 publisher&consumer 개념으로 bean 간에 통신을 할 수 있도록 event 기반의 통신을 제공하고 있다.
 * publisher는 ApplicationEventPublisher를 injection 받고 publish() 메쏘드를 통해서 event를 발행하고
 * consumer는 ApplicationEvent interface를 상속받아 원하는 이벤트 타입에 대해서 consuming을 할 수 있다.
 * 본 예제는 마트에 손님이 들어올 때와 나갈 때 event를 발생시키고 그것을 consume하는 예제이다.
 */
public class EventExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(EventAppConfig.class);
        GateKeeper gateKeeper = applicationContext.getBean(GateKeeper.class);
        Cashier cashier = applicationContext.getBean(Cashier.class);

        Customer customer1 = new Customer("Kevin");
        gateKeeper.checkin(customer1);
        Customer customer2 = new Customer("Dennis");
        gateKeeper.checkin(customer2);

        cashier.checkout(customer2);
        cashier.checkout(customer1);
    }
}

package example.spring.core.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Cashier  {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void checkout(Customer customer)  {
        CheckoutEvent event = new CheckoutEvent(customer, LocalDateTime.now());
        applicationEventPublisher.publishEvent(event);
    }
}

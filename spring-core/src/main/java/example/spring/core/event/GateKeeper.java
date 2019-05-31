package example.spring.core.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class GateKeeper {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void checkin(Customer customer)  {
        CheckinEvent event = new CheckinEvent(customer, LocalDateTime.now());
        applicationEventPublisher.publishEvent(event);
    }
}

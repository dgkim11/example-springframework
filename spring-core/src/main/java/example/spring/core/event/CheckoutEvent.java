package example.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

public class CheckoutEvent extends ApplicationEvent {
    private final Customer customer;
    private final LocalDateTime time;
    
    public CheckoutEvent(Customer customer, LocalDateTime time) {
        super(customer);
        this.customer = customer;
        this.time = time;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getTime() {
        return time;
    }
}

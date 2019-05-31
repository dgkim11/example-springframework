package example.spring.core.event;

import org.springframework.context.ApplicationEvent;

import java.time.LocalDateTime;

public class CheckinEvent extends ApplicationEvent {
    private Customer customer;
    private LocalDateTime time;

    public CheckinEvent(Customer customer, LocalDateTime time) {
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

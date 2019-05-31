package example.spring.core.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CheckinListener implements ApplicationListener<CheckinEvent> {
    @Override
    public void onApplicationEvent(CheckinEvent event) {
        System.out.println("Checkin event. customer:" + event.getCustomer().getName()
                + ", time: " + event.getTime());
    }
}

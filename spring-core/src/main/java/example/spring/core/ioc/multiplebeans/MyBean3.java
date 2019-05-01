package example.spring.core.ioc.multiplebeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bean3")
@Primary
public class MyBean3 implements MyBean {
    @Override
    public String whoAreYou() {
        return "I am Bean 3";
    }
}

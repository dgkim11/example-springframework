package example.spring.core.ioc.multiplebeans;

import org.springframework.stereotype.Component;

@Component("bean1")
public class MyBean1 implements MyBean {
    @Override
    public String whoAreYou() {
        return "I am Bean 1";
    }
}

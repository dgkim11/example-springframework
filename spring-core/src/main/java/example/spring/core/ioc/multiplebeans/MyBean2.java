package example.spring.core.ioc.multiplebeans;

import org.springframework.stereotype.Component;

@Component("bean2")
public class MyBean2 implements MyBean {
    @Override
    public String whoAreYou() {
        return "I am Bean 2";
    }
}

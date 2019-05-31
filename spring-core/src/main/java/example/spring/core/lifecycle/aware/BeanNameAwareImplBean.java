package example.spring.core.lifecycle.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 해당 Bean은 beanName을 받아서 자신이 읽거나 쓰기를 해야 하는 디렉토리 위치를 지정한다.
 */
@Component
public class BeanNameAwareImplBean implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    private String location()    {
        return "/var/app/bean/" + beanName;
    }

    public String read()    {
        return "read a file from " + location();
    }
}

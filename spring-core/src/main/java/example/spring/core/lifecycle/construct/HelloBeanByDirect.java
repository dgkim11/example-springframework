package example.spring.core.lifecycle.construct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * PostConstruct, PreDestroy 어노테이션을 통해서 Bean의 생성 및 종료 시에 특정 메쏘드가 호출될 수 있도록 한다.
 */
@Component
public class HelloBeanByDirect {
    @PostConstruct
    public void initBean()  {
        System.out.println("init HelloBeanByDirect");
    }
    @PreDestroy
    public void closeBean() {
        System.out.println("close HelloBeanByDirect");
    }

    public void hello()   {
        System.out.println("Hello world ~ from HelloBeanByDirect");
    }}

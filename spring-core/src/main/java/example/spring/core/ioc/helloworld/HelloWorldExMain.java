package example.spring.core.ioc.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 여기에서는 아주 간단하게 spring framework을 이용해서 bean을 얻고 bean을 호출하는 것을 보여준다.
 * AnnotationConfigApplicationContext를 통해서 applicationContext의 구현체를 얻고 그것을 통해서 bean 객체를 얻는다.
 */
public class HelloWorldExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldApplicationConfig.class);
        HelloWorldBean helloWorld = applicationContext.getBean(HelloWorldBean.class);
        System.out.println(helloWorld.helloWorld("Dennis"));
    }
}

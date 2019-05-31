package example.spring.core.lifecycle.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean instance가 새로 생성되거나 삭제되는 경우에 특정 메쏘드를 호출하도록 하여 Bean의 life cycle 동안 원하는 작업을 수행하게
 * 할 수 있다. 크게 방법은 두가지가 있는데 하나는 Bean 어노테이션에 life cycle 관련 메쏘드를 정의하는 방법과 Spring Bean의
 * 메쏘드에 직접 어노테이션을 다는 방법이 있다.
 */
public class BeanLifeCycleExMain {
    private static ApplicationContext applicationContext;

    public static void main(String[] args)  {
        BeanLifeCycleExMain theApp = new BeanLifeCycleExMain();
        applicationContext =
                new AnnotationConfigApplicationContext(BeanLifecycleAppConfig.class);
        theApp.usingBeanAnnotation();
        theApp.annotateDirect();
    }

    private void usingBeanAnnotation()  {
        HelloBean helloBean = applicationContext.getBean(HelloBean.class);
        helloBean.hello();
    }

    private void annotateDirect()   {
        HelloBeanByDirect helloBean = applicationContext.getBean(HelloBeanByDirect.class);
        helloBean.hello();
    }
}

package example.spring.core.ioc.multiplebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * 본 예제는 동일한 타입의 Bean이 여러개 있을 때 해당 bean들을 참조하는 여러가지 방식을 예로 설명한다.
 */
public class MultipleBeansExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MultipleBeanApplicationConfig.class);
        MyBeanService beanService = applicationContext.getBean(MyBeanService.class);
        System.out.println("### All MyBean List");
        List<MyBean> beans = beanService.getMyBeanList();
        for(MyBean bean : beans)    {
            System.out.println("bean:" + bean.whoAreYou());
        }
        System.out.println("### Current My Bean");
        System.out.println(beanService.getMyBean().whoAreYou());
        System.out.println("### Primary My Bean");
        System.out.println(beanService.getPrimaryMyBean().whoAreYou());
    }
}

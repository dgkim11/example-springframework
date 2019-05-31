package example.spring.core.lifecycle.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 빈 후처리기는 모든 빈을 대상으로 하며 빈이 생성된 후에 호출된다. 이 작업은 모든 빈에 대해서 빈 생성 후
 * 전체 빈 인스턴스를 상대로 어떤 작업을 하야 하는 경우에 사용할 수 있다.
 */
public class BeanPostProcessorExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BeanPostProcessorAppConfig.class);
        Sample1Bean bean1 = applicationContext.getBean(Sample1Bean.class);
        Sample1Bean bean2 = applicationContext.getBean(Sample1Bean.class);
    }
}

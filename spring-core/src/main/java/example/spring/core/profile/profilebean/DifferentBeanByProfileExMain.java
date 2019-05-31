package example.spring.core.profile.profilebean;

import example.spring.core.profile.profilebean.bean.FileService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Profile에 따라서 서로 다른 동작을 하는 Bean을 만들 수 있다. 예로, production 환경에서는 실제로 외부 시스템과 네트워크 통신을 하는
 * Bean이 있다고 했을 때 dev 환경에서는 회사 내부에 Mock 시스템과 통신을 하고 local에서는 아예 그러한 통신 자체를 할 필요가 없는 경우에
 * 각각의 profile 환경에 맞는 동작을 하도록 Bean을 만들 필요가 있다. 이렇게 하기 위해서는 각각의 Profile 별로 별도의 Bean을 만들고
 * 그것을 사용하는 클라이언트는 Spring framework이 profile에 맞는 적절한 bean을 알아서 injection 해준다.
 */
public class DifferentBeanByProfileExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(DifferentBeanByProfileAppConfig.class);
        FileService fileService = applicationContext.getBean(FileService.class);
        System.out.println(fileService.load());
    }
}

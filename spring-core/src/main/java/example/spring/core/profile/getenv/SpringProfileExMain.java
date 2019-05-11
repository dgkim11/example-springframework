package example.spring.core.profile.getenv;

import example.spring.core.profile.DataPipelineService;
import example.spring.core.profile.profileconfig.BaseApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring에서는 local, dev, product 등등의 서로 다른 profile에 맞는 환경 설정 값들을 읽어들어도록 설정할 수 있다.
 * profile 별로 별도의 properties 파일을 작성해야 한다. 예로, dev profile에서는 application-dev.properties,
 * local profile에서는 application-local.properties, product profile에서는 application-production.properties 파일에
 * 저장할 수 있다. 이렇게 저장된 properties 파일들은 자신의 profile에 맞는 파일을 읽어들여야 한다. 이 예제에서는
 * @PropertySource에서 어떤 properties 파일을 읽어들일지를 정의하는 방식의 예이다. 따라서 동일한 Config 클래스를 이용해서
 * 현재의 profile에 맞는 properties 파일을 읽어들인다.
 */
public class SpringProfileExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(BaseApplicationConfig.class);
        DataPipelineService dataPipelineService = applicationContext.getBean(DataPipelineService.class);
        dataPipelineService.startProcess();
    }
}

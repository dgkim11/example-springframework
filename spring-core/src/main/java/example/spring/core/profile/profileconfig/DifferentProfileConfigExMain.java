package example.spring.core.profile.profileconfig;

import example.spring.core.profile.DataPipelineService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 여기 예제에서는 서로다른 profile에 대해서 서로 다른 Config 클래스를 사용하는 경우에 대한 예제이다. 따라서 각 profile별로 별도의
 * Config 클래스를 생성한다. 현재의 profile을 설정하는 방법은 애플리케이션 시작 시에 JVM arguent로 '-Dspring.profiles.active'에 profile을
 * 지정한다. 예로, 현재의 애플리케이션을 production 모드로 띄우고 싶다면 '-Dspring.profiles.active=production' 으로 지정하면 된다.
 *
 */
public class DifferentProfileConfigExMain {
    public static void main(String[] args)  {
        DifferentProfileConfigExMain theApp = new DifferentProfileConfigExMain();
        theApp.execute();
    }

    private void execute()  {
    }
}

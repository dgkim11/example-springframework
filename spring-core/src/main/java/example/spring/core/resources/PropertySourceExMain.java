package example.spring.core.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 본 예제는 특정 property 파일에서 환경변수를 정의해 놓고 그것을 Spring의 PropertySource라는 annotation과 Value라는
 * annotation을 통해서 property 파일에 정의되어 있는 환경변수를 읽어들이는 예제이다. 여기에서는 두개의 케이스를 설명한다.
 * 첫번째는 하나의 property 파일에서 환경변수를 읽어들이는 것과 두번째는 두개의 property 파일에서 환경변수를 읽어들인다.
 * 두개의 property에서 환경변수를 읽어들일 때 동일한 키에 대해 서로 다른 값이 있는 경우 그 값은 뒤에 등록된 property 파일에 의해
 * override 된다.
 */
public class PropertySourceExMain {
    public static void main(String[] args)  {
        PropertySourceExMain theApp = new PropertySourceExMain();
        theApp.createSummaryFileByProperties();
        theApp.createSummaryFileByOverridedProperties();
    }

    private void createSummaryFileByProperties()   {
        System.out.println("#####createSummaryFileByProperties");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PropertySourceApplicationConfig.class);
        ScoreSummaryService service = applicationContext.getBean(ScoreSummaryService.class);
        service.createSummaryFile();
    }

    private void createSummaryFileByOverridedProperties()   {
        System.out.println("#####createSummaryFileByOverridedProperties");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PropertySourceApplicationOverrideConfig.class);
        ScoreSummaryService service = applicationContext.getBean(ScoreSummaryService.class);
        service.createSummaryFile();
    }
}

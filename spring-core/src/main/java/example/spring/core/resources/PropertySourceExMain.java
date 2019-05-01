package example.spring.core.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PropertySourceApplicationConfig.class);
        ScoreSummaryService service = applicationContext.getBean(ScoreSummaryService.class);
        service.createSummaryFile();
    }
}

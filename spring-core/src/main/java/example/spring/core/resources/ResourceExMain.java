package example.spring.core.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 본 예제는 외부 리소스 파일를 Resource라는 객체로 spring이 만들어주는 예이다.
 * bean은 이 resource 객체를 통해 파일의 내용을 읽어들일 수 있다.
 */
public class ResourceExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PropertySourceApplicationConfig.class);
        BannerResourceLoader bannerResourceLoader = applicationContext.getBean(BannerResourceLoader.class);
        System.out.println("banner text:");
        System.out.println(bannerResourceLoader.getBannerText());
    }
}

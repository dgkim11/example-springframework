package example.spring.core.resourcebundle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

/**
 * 본 예제에서는 다국어 지원을 위해서 resource bundle을 이용하는 예제이다.
 * Config 클래스에서 resource bundle을 읽어들일 위치, 파일명 등등을 정의하면 Spring이 현재의 Locale에 맞는 파일을 읽어들인다.
 * 예로, 영어의 경우 messages_en_US.properties로 파일 이름을 정의하고 한국어의 경우 messages_ko_KR.properties 형태로 정의한다.
 * 그 어떤 것과도 맞는 Locale이 없는 경우에는 messages.properties 파일에서 그 내용을 찾는다. 거기에도 없으면 에러를 리턴한다.
 */
public class ResourceBundleExMain {
    public static void main(String[] args)  {
        ResourceBundleExMain theApp = new ResourceBundleExMain();
        Locale.setDefault(Locale.US);
        theApp.printContents();
        Locale.setDefault(Locale.KOREA);
        theApp.printContents();
    }

    private void printContents() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ResourceBundleApplicationConfig.class);
        ContentsGenerator contentsGenerator = applicationContext.getBean(ContentsGenerator.class);
        System.out.println(contentsGenerator.getContents());
    }
}

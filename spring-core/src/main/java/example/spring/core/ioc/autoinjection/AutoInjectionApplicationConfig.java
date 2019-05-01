package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.AnnotationApplicationConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * 본 예제에서는 example.spring.core.ioc.annotation 패키지의 예제에서 사용된 bean도 같이 사용된다. config class가
 * 다른 config를 import할 수 있다. 이렇게 함으로써 필요한 설정을 새로 등록하지 않고 기존의 config class에서 가져오게 된다.
 */
@Import(AnnotationApplicationConfig.class)
@ComponentScan(basePackages = {"example.spring.core.ioc.autoinjection"})
public class AutoInjectionApplicationConfig {
}

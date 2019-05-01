package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

/**
 * 본 예제는 Bean에서 다른 Bean을 참조할 때 자동으로 Spring에서 bean을 injection 해주는 방식을
 * 보여주는 예제이다. MemberService1, 2, 3 클래스들은 각자 다른 방식으로 bean을 injection 하는 것을 보여준다.
 */
public class AutoInjectionApplicationExMain {
    public static void main(String[] args)  {
        AutoInjectionApplicationExMain theApp = new AutoInjectionApplicationExMain();
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AutoInjectionApplicationConfig.class);
        theApp.memberService(applicationContext.getBean(MemberService1.class));
        theApp.memberService(applicationContext.getBean(MemberService2.class));
        theApp.memberService(applicationContext.getBean(MemberService3.class));
    }

    private void memberService(BaseMemberService memberService)   {
        Member dennis = memberService.createMember("Dennis", "Seoul");
        Member kevin = memberService.createMember("Kevin", "Pusan");
        Optional<Member> m1 = memberService.findMemberById(dennis.getId());
        m1.ifPresent(m -> System.out.println("Found " + m.getName() + ". Id:" + m.getId() + ", level:" + m.getLevel()));
        Optional<Member> m2 = memberService.findMemberById(kevin.getId());
        m2.ifPresent(m -> System.out.println("Found " + m.getName() + ". Id:" + m.getId() + ", level:" + m.getLevel()));
    }
}

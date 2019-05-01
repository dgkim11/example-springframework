package example.spring.core.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationExMain {
    public static void main(String[] args)  {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AnnotationApplicationConfig.class);
        MemberDao memberDao = applicationContext.getBean(MemberDao.class);
        try {
            Member m1 = new Member(1L); m1.setName("Dennis"); m1.setAddress("Seoul");
            memberDao.save(m1);
            Member m2 = new Member(2L); m1.setName("Tom"); m1.setAddress("Pusan");
            memberDao.save(m2);
            Member member = memberDao.findById(1L);
            System.out.println("Found member. member name : " + member.getName() +
                    ", address : " + member.getAddress());
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
        }

    }
}

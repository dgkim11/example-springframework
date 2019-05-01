package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.MemberDao;
import org.springframework.stereotype.Service;

/**
 * 이 방식은 Autowired를 사용하지 않고 생성자에서 bean 객체를 설정할 수도 있다.
 */
@Service
public class MemberService3 extends BaseMemberService {
    private MemberDao memberDao;

    public MemberService3(MemberDao memberDao)  {
        this.memberDao = memberDao;
    }

    @Override
    protected MemberDao memberDao() {
        return memberDao;
    }
}

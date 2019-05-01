package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Autowired를 필드에 지정하여 다른 bean을 참조한다. spring은 해당 bean을 자동으로 injection 해준다.
 */
@Service
public class MemberService1 extends BaseMemberService {
    @Autowired
    private MemberDao memberDao;

    @Override
    protected MemberDao memberDao() {
        return memberDao;
    }
}

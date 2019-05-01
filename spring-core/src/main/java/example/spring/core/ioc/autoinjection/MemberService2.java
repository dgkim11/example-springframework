package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Autowired는 메쏘드에 지정할 수 있으며 메쏘드의 파라미터로 bean 객체를 지정하면 spring이 자동으로 파라미터를 넘겨주고 해당 메쏘드를 호출해준다.
 */
@Service
public class MemberService2 extends BaseMemberService {
    private MemberDao memberDao;

    @Autowired
    public void setMemberDao(MemberDao memberDao)   {
        this.memberDao = memberDao;
    }

    @Override
    protected MemberDao memberDao() {
        return memberDao;
    }
}

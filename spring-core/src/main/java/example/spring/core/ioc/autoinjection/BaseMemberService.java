package example.spring.core.ioc.autoinjection;

import example.spring.core.ioc.annotation.EntityNotFoundException;
import example.spring.core.ioc.annotation.Member;
import example.spring.core.ioc.annotation.MemberDao;

import java.util.Optional;

public abstract class BaseMemberService {
    private long currentMaxId = 0;

    protected abstract MemberDao memberDao();

    /**
     * 레벨이라는 필드는 서비스 운영중에 나중에 생긴 필드로서 level 값이 없는 회원들이 있기 때문에 service bean에서
     * 디폴트 레벨 값을 넣어주고 있다.
     * @param id
     * @return
     */
    public Optional<Member> findMemberById(Long id)   {
        try {
            Member member = memberDao().findById(id);
            if(member.getLevel() == null) member.setLevel(0);
            return Optional.of(member);
        } catch (EntityNotFoundException e) {
            return Optional.empty();
        }
    }

    /**
     * 새로운 member를 생성한다. 이 메쏘드는 단순한 예제로서의 역할을 하기 위해서 복잡성을 제거하였다.
     * 해당 메쏘드는 thread safe 하지 않기 때문에 실제 production 코드는 이렇게 작성하면 안된다.
     *
     * @param name
     * @param address
     * @return
     */
    public Member createMember(String name, String address) {
        Member member = new Member(currentMaxId++);
        member.setName(name);
        member.setAddress(address);
        memberDao().save(member);

        return member;
    }

    /**
     * 레벨이라는 필드는 서비스 운영중에 나중에 생긴 필드로서 level 값이 없는 회원들이 있기 때문에 member update시에
     * 디폴트 레벨 값을 지정한다.
     * @param member
     * @return
     */
    public Member updateMember(Member member)   {
        if(member.getLevel() == null) member.setLevel(0);
        memberDao().save(member);
        return member;
    }
}

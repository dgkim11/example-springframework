package example.spring.core.ioc.annotation;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Component라는 어노테이션을 가지고 있으므로 이것은 Spring Bean임을 말하고 있다. 이 Bean은
 * Spring framework에 의해서 자동으로 Bean으로 등록되게 된다.
 */
@Component
public class MemberDaoImpl implements MemberDao {
    private Map<Long, Member> members = new HashMap<>();

    @Override
    public Member findById(Long id) throws EntityNotFoundException  {
        if(members.containsKey(id)) {
            return members.get(id);
        } else  {
            throw new EntityNotFoundException("id : " + id);
        }
    }

    @Override
    public void save(Member member) {
        members.put(member.getId(), member);
    }
}

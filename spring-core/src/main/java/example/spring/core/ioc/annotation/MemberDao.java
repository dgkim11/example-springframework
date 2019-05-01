package example.spring.core.ioc.annotation;

public interface MemberDao {
    Member findById(Long id) throws EntityNotFoundException;
    void save(Member member);
}

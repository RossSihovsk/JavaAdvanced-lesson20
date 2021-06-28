package spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
}

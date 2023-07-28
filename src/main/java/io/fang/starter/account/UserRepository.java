package io.fang.starter.account;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
    User findByUsername(String username);

    List<User> findByUsernameContaining(@Param("name") String name);

}

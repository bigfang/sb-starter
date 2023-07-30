package io.fang.starter.domain.account;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends ListCrudRepository<User, Long>, ListPagingAndSortingRepository<User, Long> {

    User findByUsername(String username);

    List<User> findByUsernameContaining(@Param("name") String name);

}

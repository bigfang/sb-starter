package io.fang.starter.domain.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return mapper.selectList(null);
    }

    @Transactional(readOnly = true)
    public User findById(Long id) {
        return mapper.selectById(id);
    }
}

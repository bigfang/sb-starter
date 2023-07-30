package io.fang.starter.domain.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserMapper repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }
}

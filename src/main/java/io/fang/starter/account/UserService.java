package io.fang.starter.account;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}

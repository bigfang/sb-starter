package io.fang.starter.application;

import io.fang.starter.domain.account.User;
import io.fang.starter.domain.account.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
class UserController {

    private final UserService userService;

    @GetMapping("/users")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    User findById(@PathVariable Long id) {
        return userService.findById(id).isEmpty() ? null : userService.findById(id).get();
    }

}

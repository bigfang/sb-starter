package io.fang.starter.application;

import io.fang.starter.domain.account.User;
import io.fang.starter.domain.account.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "用户")
class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/{username}")
    User findById(@PathVariable String username) {
        return userService.findByUsrname(username);
    }

}

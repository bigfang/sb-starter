package io.fang.starter.account;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
class UserController {

    private final UserService userService;

    @GetMapping("/users")
    List<User> all() {
        return userService.findAll();
    }

}

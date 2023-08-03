package io.fang.starter.application;

import io.fang.starter.application.dto.LoginDto;
import io.fang.starter.application.dto.SignupDto;
import io.fang.starter.domain.account.LoginUser;
import io.fang.starter.domain.account.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Tag(name = "认证")
@Slf4j
class AuthController {
    private final UserService userService;

    @PostMapping("/signup")
    LoginUser signup(@RequestBody SignupDto dto) {
        return userService.signup(dto);
    }

    @PostMapping("/login")
    LoginUser login(@RequestBody LoginDto dto) {
        return userService.login(dto);
    }

    @PostMapping("/logout")
    Boolean logout() {
        return true;
    }

}

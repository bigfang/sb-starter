package io.fang.starter.domain.account;

import io.fang.starter.application.dto.LoginDto;
import io.fang.starter.application.dto.SignupDto;
import io.fang.starter.configuration.BearerTokenProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final BearerTokenProvider bearerTokenProvider;

    @Transactional(readOnly = true)
    public List<User> findAll() {
        return mapper.selectList(null);
    }

    @Transactional(readOnly = true)
    public User findById(Long id) {
        return mapper.selectById(id);
    }

    @Transactional(readOnly = true)
    public User findByUsrname(String username) {
        return mapper.selectByUsername(username);
    }

    public LoginUser signup(SignupDto dto) {
        if (mapper.selectByUsername(dto.getUsername()) != null) {
            throw new IllegalArgumentException("Username `%s` is already exists.".formatted(dto.getUsername()));
        }
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setBirthDay(dto.getBirthDay());
        mapper.insert(user);

        LoginUser loginUser = new LoginUser(user);
        loginUser.setToken(bearerTokenProvider.createBearerToken(user));
        return loginUser;
    }

    @Transactional(readOnly = true)
    public LoginUser login(LoginDto dto) {
        User user = mapper.selectByUsername(dto.getUsername());
        if (user != null && passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            LoginUser loginUser = new LoginUser(user);
            loginUser.setToken(bearerTokenProvider.createBearerToken(user));
            return loginUser;
        } else {
            throw new IllegalArgumentException("invalid username or password");
        }
    }

}

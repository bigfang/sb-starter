package io.fang.starter.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LoginUser {
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private LocalDate birthDay;
    private String token;
    private String refreshToken;

    public LoginUser(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.birthDay = user.getBirthDay();
        this.token = null;
        this.refreshToken = null;
    }
}

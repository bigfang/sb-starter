package io.fang.starter.domain.account;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoginUser {
    private String username;
    private LocalDate birthDay;
    private String token;
    private String refreshToken;

    public LoginUser(User user) {
        this.username = user.getUsername();
        this.birthDay = user.getBirthDay();
        this.token = null;
        this.refreshToken = null;
    }
}

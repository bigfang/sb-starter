package io.fang.starter.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LoginUser {
    private Long id;
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private LocalDate birthday;
    private String token;
    private String refreshToken;

    public LoginUser(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.birthday = user.getBirthday();
        this.token = null;
        this.refreshToken = null;
    }
}

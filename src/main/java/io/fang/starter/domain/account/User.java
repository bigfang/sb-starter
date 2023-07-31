package io.fang.starter.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.fang.starter.support.AbstractEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User extends AbstractEntity {
    private String username;
    @JsonIgnore
    private String password;
    private LocalDate birthDay;
}

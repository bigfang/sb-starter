package io.fang.starter.domain.account;

import io.fang.starter.support.AbstractEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User extends AbstractEntity {
    private String username;
    private String password;
    private LocalDate birthDay;
}

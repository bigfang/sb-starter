package io.fang.starter.domain.account;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.fang.starter.support.AbstractEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("users")
public class User extends AbstractEntity {
    private String username;
    @JsonIgnore
    private String password;
    private LocalDate birthDay;
}

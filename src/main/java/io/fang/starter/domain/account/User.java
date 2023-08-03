package io.fang.starter.domain.account;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fang.starter.support.AbstractEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
@TableName("users")
public class User extends AbstractEntity {
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private LocalDate birthday;
}

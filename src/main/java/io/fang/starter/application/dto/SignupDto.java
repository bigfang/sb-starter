package io.fang.starter.application.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SignupDto {
    private String username;
    private String password;
    private LocalDate birthDay;
}

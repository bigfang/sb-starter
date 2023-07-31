package io.fang.starter.application.dto;

import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String body;
    private Long AuthorId;
}

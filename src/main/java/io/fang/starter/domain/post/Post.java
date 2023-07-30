package io.fang.starter.domain.post;

import lombok.Data;

@Data
public class Post {
    private String title;
    private String body;
    private String authorId;
}

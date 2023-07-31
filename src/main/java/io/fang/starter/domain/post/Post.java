package io.fang.starter.domain.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.fang.starter.domain.account.User;
import io.fang.starter.support.AbstractEntity;
import lombok.Data;

@Data
public class Post extends AbstractEntity {
    private String title;
    private String body;
    @JsonIgnore
    private Long authorId;
    private User author;
}

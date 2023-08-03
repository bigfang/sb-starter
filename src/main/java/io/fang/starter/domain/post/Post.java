package io.fang.starter.domain.post;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.fang.starter.domain.account.User;
import io.fang.starter.support.AbstractEntity;
import lombok.Data;

@Data
@TableName("posts")
public class Post extends AbstractEntity {
    private String title;
    private String body;
    @JsonIgnore
    private Long authorId;
    private User author;
}

package io.fang.starter.domain.post;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface PostMapper extends BaseMapper<Post> {
    Post findById(Long id);

    List<Post> findAll();
}

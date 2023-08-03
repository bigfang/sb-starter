package io.fang.starter.domain.post;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PostMapper extends BaseMapper<Post> {
    Post findById(Long id);

    List<Post> findAll();
}

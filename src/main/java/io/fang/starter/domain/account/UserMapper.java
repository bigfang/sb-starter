package io.fang.starter.domain.account;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from users where username=#{username}")
    User selectByUsername(String username);
}

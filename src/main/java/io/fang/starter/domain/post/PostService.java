package io.fang.starter.domain.post;

import io.fang.starter.application.dto.PostVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper repo;

    public List<PostVo> findAll() {
        List<Post> posts = repo.findAll();
        return null;
    }
}

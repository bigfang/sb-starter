package io.fang.starter.domain.post;

import io.fang.starter.application.dto.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper mapper;

    private void setPost(Post post, PostDto dto) {
        post.setTitle(dto.getTitle());
        post.setBody(dto.getBody());
        post.setAuthorId(dto.getAuthorId());
    }

    @Transactional(readOnly = true)
    public List<Post> findAll() {
        return mapper.findAll();
    }

    @Transactional(readOnly = true)
    public Post findById(Long id) {
        return mapper.findById(id);
    }

    @Transactional
    public Post create(PostDto dto) {
        Post post = new Post();
        setPost(post, dto);
        mapper.insert(post);
        return mapper.selectById(post.getId());
    }

    @Transactional
    public Post updateById(Long id, PostDto dto) {
        Post post = this.findById(id);
        setPost(post, dto);
        mapper.updateById(post);
        return mapper.selectById(id);
    }

    @Transactional
    public Post deleteById(Long id) {
        Post post = mapper.selectById(id);
        mapper.deleteById(id);
        return post;
    }
}

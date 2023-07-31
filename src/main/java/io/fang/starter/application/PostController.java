package io.fang.starter.application;

import io.fang.starter.application.dto.PostDto;
import io.fang.starter.domain.post.Post;
import io.fang.starter.domain.post.PostService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@Tag(name = "文章")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    List<Post> findAll() {
        List<Post> posts = postService.findAll();
        return posts;
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable Long id) {
        return postService.findById(id);
    }

    @PostMapping("")
    public Post create(@RequestBody PostDto dto) {
        return postService.create(dto);
    }

    @PatchMapping("/{id}")
    public Post updateById(@PathVariable Long id, @RequestBody PostDto dto) {
        return postService.updateById(id, dto);
    }

    @DeleteMapping("/{id}")
    public Post deleteByid(@PathVariable Long id) {
        postService.deleteById(id);
        return null;
    }

}

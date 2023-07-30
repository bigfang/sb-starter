package io.fang.starter.application;

import io.fang.starter.application.dto.PostVo;
import io.fang.starter.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/posts")
    List<PostVo> findAll() {
        return postService.findAll();
    }

}

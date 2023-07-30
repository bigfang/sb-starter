package io.fang.starter.domain.post;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostMapper extends ListCrudRepository<io.fang.starter.domain.post.Post, Long>, ListPagingAndSortingRepository<io.fang.starter.domain.post.Post, Long> {

    Post findByTitle(String title);

    List<Post> findByTitleContaining(@Param("title") String title);

}

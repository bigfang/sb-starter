package io.fang.starter.application;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "主页")
class HomeController {

    @GetMapping("/")
    String home() {
        return "hello world!";
    }

}

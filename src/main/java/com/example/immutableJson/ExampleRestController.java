package com.example.immutableJson;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
class ExampleRestController {

    @GetMapping
    ResponseListDto getExampleDto() {

        List<String> list = new ArrayList<>();
        list.add("aaa");

        return ResponseListDto.builder()
                .list(list)
                .empty(list.isEmpty())
                .build();
    }

    @PostMapping
    void postExample(@RequestBody RequestBodyDto requestBodyDto) {
        log.info(requestBodyDto.toString());
    }
}

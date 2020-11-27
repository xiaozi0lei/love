package com.guoleishenbo.love.controller;

import com.guoleishenbo.love.model.vo.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @GetMapping("/test")
    public RestResult test() {
        return RestResult.fromData("test");
    }
}

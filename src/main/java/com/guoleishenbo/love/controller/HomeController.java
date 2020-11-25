package com.guoleishenbo.love.controller;

import com.guoleishenbo.love.model.vo.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public RestResult home() {
        String love = "Love!";
        return RestResult.fromData(love);
    }
}

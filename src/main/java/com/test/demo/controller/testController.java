package com.test.demo.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class testController {

    int counter = 0;
    @GetMapping("/hit")
    public String test() {
        log.info("Client App Hit:" + counter);
        return "You have hit the client controller: "+ counter++;
    }

}

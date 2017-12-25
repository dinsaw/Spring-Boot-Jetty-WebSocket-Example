package com.dineshsawant.websocketdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dnsh on 25/12/17.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/randomNames")
    public String randomNames() {
        return "/randomNames.html";
    }
}

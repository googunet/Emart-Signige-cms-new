package com.example.esgtest1.eligaapi.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScheduleApiController {
    @RequestMapping(value = "/")
    public String main() {
        System.out.println("aaaaa");
        return "index";
    }
}

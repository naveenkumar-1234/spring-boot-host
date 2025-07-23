package com.demo.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EntryController {

    @GetMapping("/")
    public Map<String,String> test(){
        return Map.of(
                "status","success"
        );
    }
}

package com.example.practicegithubActiondeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/")
    public String t1() {
        return "Test Success!!!";
    }
}

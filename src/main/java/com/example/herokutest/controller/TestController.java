package com.example.herokutest.controller;

import com.example.herokutest.entity.Test;
import com.example.herokutest.repository.TestRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/test")
public class TestController {
    private final TestRepository testRepository;

    public TestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @GetMapping
    public List<Test> getTest(){
        return testRepository.findAll();
    }
}

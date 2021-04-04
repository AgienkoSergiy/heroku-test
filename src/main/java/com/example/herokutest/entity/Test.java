package com.example.herokutest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    @GeneratedValue
    private Long id;

    private String testName;

    public Test() {
    }

    public Test(Long id, String testName) {
        this.id = id;
        this.testName = testName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String name) {
        this.testName = name;
    }
}

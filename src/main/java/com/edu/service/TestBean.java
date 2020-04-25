package com.edu.service;

public class TestBean {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public TestBean(String name) {
        Name = name;
    }

    public TestBean() {
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "Name='" + Name + '\'' +
                '}';
    }
}
